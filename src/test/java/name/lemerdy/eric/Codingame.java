package name.lemerdy.eric;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.base.Joiner.on;
import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.io.Files.readLines;
import static com.google.common.io.Resources.getResource;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Codingame {
    @Test
    public void with_files() throws IOException, URISyntaxException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (File in : getFileDir().listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return s.matches("Test_\\d_input.txt");
            }
        })) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            assertThat(in.exists(), CoreMatchers.is(true));
            main(new FileInputStream(in), new PrintStream(out), null);
            String output = in.getName().replace("input", "output");
            assertThat("actual is different from " + output + " content.", out.toString(), is(on("\n").join(concat(readLines(new File(getFileDir(), output), UTF_8), newArrayList("")))));
        }
    }

    public void main(FileInputStream fileInputStream, PrintStream printStream, String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method main = getClass().getClassLoader().loadClass(getClass().getPackage().getName() + ".Solution").getMethod("main", InputStream.class, PrintStream.class, String[].class);
        main.invoke(null, new Object[]{fileInputStream, printStream, args});
    }

    public File getFileDir() throws URISyntaxException{
        return new File(getResource(getClass().getPackage().getName().replace('.', '/') + '/').toURI());
    }
}
