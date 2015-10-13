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
public class MedianOfMedian {
    public static class Solution {

        public static int medianInplaceQuickSort(int[] ar, int low, int high) {
            int pivotIndex = partition(ar, low, high);
            int median = ar.length / 2;
            if (pivotIndex > median) {
                return medianInplaceQuickSort(ar, low, pivotIndex - 1);
            } else if (pivotIndex < median) {
                return medianInplaceQuickSort(ar, pivotIndex + 1, high);
            } else {
                System.out.println(ar[median]);
                return ar[median];
            }
        }

        public static int partition(int[] ar, int low, int high) {
            int pivotValue = ar[high];
            int i = low;
            for (int j = low; j < high; j++) {
                if (ar[j] <= pivotValue) {
                    swap(ar, i, j);
                    i = i + 1;
                }
            }
            swap(ar, i, high);
            return i;
        }

        private static void swap(int[] ar, int i1, int i2) {
            int tempValue = ar[i1];
            ar[i1] = ar[i2];
            ar[i2] = tempValue;
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                int[] ar = new int[n];
                for (int i = 0; i < n; i++) {
                    ar[i] = in.nextInt();
                }
                medianInplaceQuickSort(ar, 0, ar.length - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
