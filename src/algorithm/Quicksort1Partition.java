/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class Quicksort1Partition {
    public static class Solution {

        public static void quicksortPartition(int[] a) {
            int pivot = a[0];
            List<Integer> leftPartion = new ArrayList<>();
            List<Integer> rightPartion = new ArrayList<>();
            for (int i = 1; i < a.length; i++) {
                if (a[i] > pivot) {
                    rightPartion.add(a[i]);
                } else {
                    leftPartion.add(a[i]);
                }
            }
            List<Integer> result = new ArrayList<>();
            result.addAll(leftPartion);
            result.add(pivot);
            result.addAll(rightPartion);
            printArray(result);
        }

        static void printArray(List<Integer> ar) {
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
                quicksortPartition(ar);
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
