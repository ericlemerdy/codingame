package name.lemerdy.eric.temperatures;

import name.lemerdy.eric.Codingame;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static name.lemerdy.eric.temperatures.Solution.temperaturesAmong;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest extends Codingame {

    @Test
    @DisplayName("with simple temperatures should find closest to zero")
    void with_simple_temperatures_should_find_closest_to_zero() {
        assertThat(temperaturesAmong(1, -2, -8, 4, 5).findClosestToZero()).isEqualTo(1);
    }

    @Test
    @DisplayName("with no temperatures should find zero")
    void with_no_temperatures_should_find_zero() {
        assertThat(temperaturesAmong().findClosestToZero()).isEqualTo(0);
    }

    @Test
    @DisplayName("with complex temperatures should find zero")
    void with_complex_temperatures_should_find_zero() {
        assertThat(temperaturesAmong(-5, -4, -2, 12, -40, 4, 2, 18, 11, 5).findClosestToZero()).isEqualTo(2);
    }
}
