/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package challange.southeast.europe.icpc2014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class Banks {

    public static class Solution {
        public static void bankAlgorithm(List<Integer> banks) {
            int firstIndex = 0;
            int lastIndex = banks.size() - 1;
            int count = 0;
            while (Collections.min(banks) < 0) {
                Integer minValue = Collections.min(banks);
                int minValueIndex = banks.indexOf(minValue);
                int leftNeighbour = minValueIndex == firstIndex ? lastIndex : minValueIndex - 1;
                int rightNeighbour = minValueIndex == lastIndex ? firstIndex : minValueIndex + 1;
                banks.set(minValueIndex, Math.abs(minValue));
                banks.set(leftNeighbour, banks.get(leftNeighbour) + minValue);
                banks.set(rightNeighbour, banks.get(rightNeighbour) + minValue);
                //printArrayLn(banks);
                count = count + 1;
            }
            System.out.println(count);
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
                List<Integer> banks = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    banks.add(in.nextInt());
                }
                bankAlgorithm(banks);
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }

}