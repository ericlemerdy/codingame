package name.lemerdy.eric.readwrite;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {

    public static void main(String args[]) {
        main(System.in, System.out, args);
    }

    public static void main(InputStream input, PrintStream out, String args[]) {
        Scanner in = new Scanner(input);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        in.useDelimiter("\\n");
        String word = in.next();
        in.useDelimiter("\\s");
        String okString = in.next();
        String nokString = in.next();
        out.println(new Solution().withNumbers(n1, n2).andString(word).display(okString).ifNumbersSumIsEqualToWordLengthAnd(nokString).otherwise());
    }

    public Solution.WithNumbers withNumbers(int n1, int n2) {
        return new Solution.WithNumbers(this, n1, n2);
    }

    public class WithNumbers {
        private Solution solution;
        private final int n1;
        private final int n2;

        public WithNumbers(Solution solution, int n1, int n2) {
            this.solution = solution;
            this.n1 = n1;
            this.n2 = n2;
        }

        public Solution.AndWord andString(String word) {
            return new AndWord(this, word);
        }

        public int sum() {
            return n1 + n2;
        }
    }

    class AndWord {
        private WithNumbers withNumbers;
        private String word;

        public AndWord(WithNumbers withNumbers, String word) {
            this.withNumbers = withNumbers;
            this.word = word;
        }

        public Solution.Display display(String ok) {
            return new Display(this, ok);
        }
    }

    class Display {
        private AndWord andWord;
        private String okWord;

        public Display(AndWord andWord, String ok) {
            this.andWord = andWord;
            this.okWord = ok;
        }

        public Solution.IfNumbersSumIsEqualToWordLengthAnd ifNumbersSumIsEqualToWordLengthAnd(String nok) {
            return new IfNumbersSumIsEqualToWordLengthAnd(this, nok);
        }
    }

    class IfNumbersSumIsEqualToWordLengthAnd {
        private final Display display;
        private final String nokWord;

        public IfNumbersSumIsEqualToWordLengthAnd(Display display, String nok) {
            this.display = display;
            this.nokWord = nok;
        }

        public String otherwise() {
            int numbersSum = display.andWord.withNumbers.sum();
            int stringLength = display.andWord.word.length();
            if (numbersSum == stringLength) {
                return display.okWord;
            } else {
                return nokWord;
            }
        }
    }
}
