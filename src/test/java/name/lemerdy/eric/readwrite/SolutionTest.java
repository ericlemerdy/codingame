package name.lemerdy.eric.readwrite;

import name.lemerdy.eric.Codingame;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.net.URISyntaxException;

import static com.google.common.io.Resources.getResource;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SolutionTest extends Codingame {

    @Test
    public void with_number_sum_equals_to_string_length_should_return_first_word() {
        assertThat(new Solution().withNumbers(22, -10).andString("hello world!").display("ok").ifNumbersSumIsEqualToWordLengthAnd("nok").otherwise(), is("ok"));
    }

    @Test
    public void with_number_sum_not_equals_to_string_length_should_return_second_word() {
        assertThat(new Solution().withNumbers(2, 1).andString("wrong sum").display("ok").ifNumbersSumIsEqualToWordLengthAnd("nok").otherwise(), is("nok"));
    }

}
