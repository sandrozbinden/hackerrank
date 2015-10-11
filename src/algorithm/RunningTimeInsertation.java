package algorithm;

import java.util.Scanner;

public class RunningTimeInsertation {

    public static class Solution {

        public static int insertionSort(int[] A) {
            int shifts = 0;
            for (int i = 1; i < A.length; i++) {
                int value = A[i];
                int j = i;
                while (j > 0 && A[j - 1] > value) {
                    A[j] = A[j - 1];
                    j = j - 1;
                    shifts++;
                }
                A[j] = value;
            }
            System.out.println(shifts);
            return shifts;
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                int[] ar = new int[n];
                for (int i = 0; i < n; i++) {
                    ar[i] = in.nextInt();
                }
                insertionSort(ar);
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }

}