package name.lemerdy.eric.readwrite;

import name.lemerdy.eric.Codingame;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest extends Codingame {

    @Test
    @DisplayName("with number sum equals to string length should return first word")
    void with_number_sum_equals_to_string_length_should_return_first_word() {
        assertThat(new Solution().withNumbers(22, -10).andString("hello world!").display("ok").ifNumbersSumIsEqualToWordLengthAnd("nok").otherwise()).isEqualTo("ok");
    }

    @Test
    @DisplayName("with number sum not equals to string length should return second word")
    void with_number_sum_not_equals_to_string_length_should_return_second_word() {
        assertThat(new Solution().withNumbers(2, 1).andString("wrong sum").display("ok").ifNumbersSumIsEqualToWordLengthAnd("nok").otherwise()).isEqualTo("nok");
    }

}
