package algorithm.implementation;

import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class ServiceLane {
    public static class Solution {

        public static int serviceLane(int[] ar, int low, int high) {
            int min = 3;
            for (int i = low; i <= high; i++) {
                min = Math.min(min, ar[i]);
                if (min == 1) {
                    break;
                }
            }
            return min;
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                int testcases = in.nextInt();
                int[] ar = new int[n];
                for (int i = 0; i < n; i++) {
                    ar[i] = in.nextInt();
                }
                for (int testcase = 0; testcase < testcases; testcase++) {
                    int i = in.nextInt();
                    int j = in.nextInt();
                    System.out.println(serviceLane(ar, i, j));
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
