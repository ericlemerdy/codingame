package name.lemerdy.eric.temperatures;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Math.abs;
import static java.lang.Math.max;

public class Solution {
    private Integer[] temperatures;

    public Solution(Integer... temperatures) {
        this.temperatures = temperatures;
    }

    public static Solution temperaturesAmong(Integer... temperatures) {
        return new Solution(temperatures);
    }

    public int findClosestToZero() {
        if (temperatures.length == 0) {
            return 0;
        }
        int closestToZero = MAX_VALUE;
        for (int temperature : temperatures) {
            if (abs(temperature) == abs(closestToZero)) {
                closestToZero = max(temperature, closestToZero);
            } else if (abs(temperature) < abs(closestToZero)) {
                closestToZero = temperature;
            }
        }
        return closestToZero;
    }

    public static void main(InputStream input, PrintStream output, String[] args) {
        Scanner in = new Scanner(input);
        int n = in.nextInt();
        List<Integer> temperatures = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            temperatures.add(in.nextInt());
        }
        output.println(Solution.temperaturesAmong(temperatures.toArray(new Integer[]{})).findClosestToZero());
    }

    public static void main(String[] args) {
        main(System.in, System.out, args);
    }
}
