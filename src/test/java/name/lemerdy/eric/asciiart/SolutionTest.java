package name.lemerdy.eric.asciiart;

import name.lemerdy.eric.Codingame;
import org.junit.Test;

import java.util.Collection;

import static com.google.common.collect.Lists.newArrayList;
import static name.lemerdy.eric.asciiart.Solution.withWidth;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest extends Codingame {
    @Test
    public void with_an_alphabet_should_write_letter_e() {
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
        assertArrayEquals(newArrayList( //
                "### ",
                "#   ",
                "##  ",
                "#   ",
                "### ").toArray(), e.toArray()
        );
    }

    @Test
    public void with_an_alphabet_should_write_letter_a() {
        Collection<String> a = withWidth(4).andHeight(5).andAlphabet(newArrayList(//
                " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ",
                "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ",
                "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ",
                "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ",
                "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ")).write("A");
        assertArrayEquals(newArrayList( //
                " #  ",
                "# # ",
                "### ",
                "# # ",
                "# # ").toArray(), a.toArray());
    }

    @Test
    public void with_an_alphabet_should_write_letters_ab() {
        Collection<String> a = withWidth(4).andHeight(5).andAlphabet(newArrayList(//
                " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ",
                "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ",
                "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ",
                "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ",
                "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ")).write("AB");
        assertArrayEquals(newArrayList( //
                " #  ##  ",
                "# # # # ",
                "### ##  ",
                "# # # # ",
                "# # ##  ").toArray(), a.toArray());
    }
}
