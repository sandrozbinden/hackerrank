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
public class SherlockWatson {
    public static class Solution {

        public static int printResult(int[] array, int k, int q) {
            int n = array.length;
            k = k % n;
            return array[((n - k) + q) % n];
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                int k = in.nextInt();
                int q = in.nextInt();

                int[] array = new int[n];
                for (int i = 0; i < n; i++) {
                    array[i] = in.nextInt();
                }
                for (int i = 0; i < q; i++) {
                    int query = in.nextInt();
                    System.out.println(printResult(array, k, query));
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
