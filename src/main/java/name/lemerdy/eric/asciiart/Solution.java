package name.lemerdy.eric.asciiart;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static com.google.common.collect.Lists.newArrayList;
import static java.lang.String.valueOf;

public class Solution {
    public static void main(InputStream input, PrintStream output, String[] args) {
        Scanner in = new Scanner(input);
        int width = in.nextInt();
        int height = in.nextInt();
        String message = in.next();
        in.nextLine();
        List<String> alphabet = newArrayList();
        while (in.hasNextLine()) {
            alphabet.add(in.nextLine());
        }
        Collection<String> out = withWidth(width).andHeight(height).andAlphabet(alphabet).write(message);
        for (String s : out) {
            output.append(s);
            output.append("\n");
        }
    }

    public static AlphabetBuilder withWidth(int width) {
        return new AlphabetBuilder(width);
    }

    public static class AlphabetBuilder {
        private int width;
        private int height;

        public AlphabetBuilder(int width) {
            this.width = width;
        }

        public AlphabetBuilder andHeight(int height) {
            this.height = height;
            return this;
        }

        public Solution.Alphabet andAlphabet(List<String> asciiAlphabet) {
            Multimap<Character, String> characterToAscii = ArrayListMultimap.create();
            Map<Integer, Character> letters = ImmutableMap.<Integer, Character>builder().put(0, 'A').put(1, 'B').put(2, 'C').put(3, 'D').put(4, 'E').put(5, 'F').put(6, 'G').put(7, 'H').put(8, 'I').put(9, 'J').put(10, 'K').put(11, 'L').put(12, 'M').put(13, 'N').put(14, 'O').put(15, 'P').put(16, 'Q').put(17, 'R').put(18, 'S').put(19, 'T').put(20, 'U').put(21, 'V').put(22, 'W').put(23, 'X').put(24, 'Y').put(25, 'Z').build();
            for (int i = 0; i < height; i++) {
                for (int letterIndex = 0; letterIndex < 27; letterIndex++) {
                    int letterColumn = width * letterIndex;
                    Character letter = letters.get(letterIndex);
                    characterToAscii.put(letter, asciiAlphabet.get(i).substring(letterColumn, width * (letterIndex + 1)));
                }
            }
            return new Alphabet(characterToAscii);
        }
    }

    public static class Alphabet {
        private Multimap<Character, String> characterToAscii;

        public Alphabet(Multimap<Character, String> characterToAscii) {
            this.characterToAscii = characterToAscii;
        }

        public Collection<String> write(String message) {
            List<String> asciiLines = newArrayList(characterToAscii.get((char) message.getBytes()[0]));
            for (int i = 0; i < asciiLines.size(); i++) {
                asciiLines.get(i);
                for (int j = 1; j < message.length(); j++) {
                    String letter = valueOf((char) message.getBytes()[j]).toUpperCase();
                    if (letter.matches("[a-z]|[A-Z]")) {
                        char l = letter.charAt(0);
                        asciiLines.set(i, asciiLines.get(i).concat((String) characterToAscii.get(l).toArray()[i]));
                    } else {
                        asciiLines.set(i, asciiLines.get(i).concat((String) characterToAscii.get(null).toArray()[i]));
                    }
                }
            }
            return asciiLines;
        }
    }
}
