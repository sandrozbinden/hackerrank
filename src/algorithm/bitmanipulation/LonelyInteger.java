package algorithm.bitmanipulation;

import java.util.Scanner;


public class LonelyInteger {
	public static class Solution {

		private static void lonelyInteger(int[] ar) {
			int result = 101;
			for (int i : ar) {
				result = result ^ i;
			}
			result = result ^101;
			System.out.println(result);
		}

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                int[] ar = new int[n];
                for (int i = 0; i < n; i++) {
                    ar[i] = in.nextInt();
                }
                lonelyInteger(ar);
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
