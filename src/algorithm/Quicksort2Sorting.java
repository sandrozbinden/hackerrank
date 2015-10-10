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
public class Quicksort2Sorting {
    public static class Solution {

		public static void quicksort(int[] ar) {
			List<Integer> array = new ArrayList<Integer>();
			for (int a: ar ) {
				array.add(a);
			}
			quicksortPartition(array);
			
		}
        public static List<Integer> quicksortPartition(List<Integer> a) {
        	if (a.size() == 1) {
        		return a;
        	}
            int pivot = a.get(0);
            List<Integer> leftPartion = new ArrayList<>();
            List<Integer> rightPartion = new ArrayList<>();
            for (int i = 1; i < a.size(); i++) {
                if (a.get(i) > pivot) {
                    rightPartion.add(a.get(i));
                } else {
                    leftPartion.add(a.get(i));
                }
            }
            List<Integer> result = new ArrayList<Integer>();
            if (leftPartion.size() > 0) {
            	result.addAll(quicksortPartition(leftPartion));
            }
            result.add(pivot);
            if (rightPartion.size() > 0) {
            	result.addAll(quicksortPartition(rightPartion));
            }
            printArrayLn(result);
            return result;
        }

        static void printArrayLn(List<Integer> ar) {
            for (int n : ar) {
                System.out.print(n + " ");
            }
            System.out.print(System.lineSeparator());
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                int[] ar = new int[n];
                for (int i = 0; i < n; i++) {
                    ar[i] = in.nextInt();
                }
                quicksort(ar);
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
