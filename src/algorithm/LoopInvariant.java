/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm;

import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class LoopInvariant {

    public static class Solution {

        public static void insertionSort(int[] A) {
            for (int i = 1; i < A.length; i++) {
                int value = A[i];
                int j = i - 1;
                while (j >= 0 && A[j] > value) { //The fix is to use >= instead of >
                    A[j + 1] = A[j];
                    j = j - 1;
                }
                A[j + 1] = value;
            }
            printArray(A);
        }

        static void printArray(int[] ar) {
            for (int n : ar) {
                System.out.print(n + " ");
            }
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
