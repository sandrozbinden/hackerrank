package algorithm.implementation;

import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class ManasAndStones {
    public static class Solution {

        public static void mansaStones(int stoneCount, int inputA, int inputB) {
            int a = Math.min(inputA, inputB);
            int b = Math.max(inputA, inputB);
            int current = a * (stoneCount - 1);
            int max = b * (stoneCount - 1);
            int difference = b - a;
            if (a == b) {
                System.out.println(current);
            } else {
                StringBuilder solution = new StringBuilder();
                while (current <= max) {
                    solution.append(current + " ");
                    current = current + difference;
                }
                System.out.println(solution);
            }
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int t = in.nextInt();
                for (int i = 0; i < t; i++) {
                    mansaStones(in.nextInt(), in.nextInt(), in.nextInt());
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
