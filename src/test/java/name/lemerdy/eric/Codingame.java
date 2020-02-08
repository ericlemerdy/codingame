package name.lemerdy.eric;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.stream.Stream;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.base.Joiner.on;
import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.io.Files.readLines;
import static com.google.common.io.Resources.getResource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
abstract public class Codingame {

    @DisplayName("with files")
    @MethodSource("files")
    @ParameterizedTest(name = "{index}: ''{0}''")
    void with_files(File in) throws IOException, URISyntaxException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertThat(in.exists()).isTrue();
        main(new FileInputStream(in), new PrintStream(out), null);
        String output = in.getName().replace("input", "output");
        assertThat(out.toString()).describedAs("actual is different from %s content.", output).isEqualTo(on("\n").join(concat(readLines(new File(getFileDir(), output), UTF_8), newArrayList(""))));
    }

    private Stream<File> files() throws URISyntaxException {
        return Arrays.stream(getFileDir().listFiles((file, s) -> s.matches("Test_\\d_input.txt")));
    }

    private void main(FileInputStream fileInputStream, PrintStream printStream, String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method main = getClass().getClassLoader().loadClass(getClass().getPackage().getName() + ".Solution").getMethod("main", InputStream.class, PrintStream.class, String[].class);
        main.invoke(null, fileInputStream, printStream, args);
    }

    private File getFileDir() throws URISyntaxException {
        return new File(getResource(getClass().getPackage().getName().replace('.', '/') + '/').toURI());
    }
}
