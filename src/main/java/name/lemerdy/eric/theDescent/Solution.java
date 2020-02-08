package name.lemerdy.eric.theDescent;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        main(System.in, System.out, args);
    }

    public static void main(InputStream input, PrintStream output, String[] args) {
        Scanner in = new Scanner(input);
        while (in.hasNext()) {
            Map<Integer, Integer> heightByMountain = new LinkedHashMap<>();
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();
                heightByMountain.put(i, mountainH);
            }
            int maxHeight = 0;
            int targetMountain = 0;
            for (Map.Entry<Integer, Integer> heightsByMountain : heightByMountain.entrySet()) {
                if (maxHeight < heightsByMountain.getValue()) {
                    maxHeight = heightsByMountain.getValue();
                    targetMountain = heightsByMountain.getKey();
                }
            }
            output.println(targetMountain);
        }
    }
}