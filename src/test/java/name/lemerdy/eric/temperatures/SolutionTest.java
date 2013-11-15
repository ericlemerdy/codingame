package name.lemerdy.eric.temperatures;

import name.lemerdy.eric.Codingame;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

import static com.google.common.io.Resources.getResource;
import static name.lemerdy.eric.temperatures.Solution.temperaturesAmong;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SolutionTest extends Codingame {

    @Test
    public void with_simple_temperatures_should_find_closest_to_zero() {
        assertThat(temperaturesAmong(1, -2, -8, 4, 5).findClosestToZero(), is(1));
    }

    @Test
    public void with_no_temperatures_should_find_zero() {
        assertThat(temperaturesAmong().findClosestToZero(), is(0));
    }

    @Test
    public void with_complex_temperatures_should_find_zero() {
        assertThat(temperaturesAmong(-5, -4, -2, 12, -40, 4, 2, 18, 11, 5).findClosestToZero(), is(2));
    }
}
