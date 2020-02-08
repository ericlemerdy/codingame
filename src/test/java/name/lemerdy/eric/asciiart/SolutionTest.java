package name.lemerdy.eric.asciiart;

import name.lemerdy.eric.Codingame;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static com.google.common.collect.Lists.newArrayList;
import static name.lemerdy.eric.asciiart.Solution.withWidth;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest extends Codingame {

    @Test
    @DisplayName("with an alphabet should write letter e")
    void with_an_alphabet_should_write_letter_e() {
        Collection<String> e;
        Solution.AlphabetBuilder alphabetBuilder = withWidth(4);
        Solution.AlphabetBuilder alphabetBuilder1 = alphabetBuilder.andHeight(5);
        Solution.Alphabet alphabet = alphabetBuilder1.andAlphabet(newArrayList(//
                " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ",
                "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ",
                "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ",
                "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ",
                "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  "));
        e = alphabet.write("E");
        assertThat(e.toArray()).isEqualTo(newArrayList( //
                "### ",
                "#   ",
                "##  ",
                "#   ",
                "### ").toArray());
    }

    @Test
    @DisplayName("with an alphabet should write letter a")
    void with_an_alphabet_should_write_letter_a() {
        Collection<String> a = withWidth(4).andHeight(5).andAlphabet(newArrayList(//
                " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ",
                "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ",
                "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ",
                "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ",
                "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ")).write("A");
        assertThat(a.toArray()).isEqualTo(newArrayList( //
                " #  ",
                "# # ",
                "### ",
                "# # ",
                "# # ").toArray());
    }

    @Test
    @DisplayName("with an alphabet should write letters ab")
    void with_an_alphabet_should_write_letters_ab() {
        Collection<String> a = withWidth(4).andHeight(5).andAlphabet(newArrayList(//
                " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ",
                "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ",
                "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ",
                "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ",
                "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ")).write("AB");
        assertThat(a.toArray()).isEqualTo(newArrayList( //
                " #  ##  ",
                "# # # # ",
                "### ##  ",
                "# # # # ",
                "# # ##  ").toArray());
    }
}
