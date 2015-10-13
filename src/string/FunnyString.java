/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package string;

import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class FunnyString {
    public static class Solution {

        public static boolean isFunny(String input) {
            String reverseInput = new StringBuilder(input).reverse().toString();
            for (int i = 0; i < input.length() - 1; i++) {
                int inputDiff = Math.abs(input.charAt(i + 1) - input.charAt(i));
                int reverseInputDiff = Math.abs(reverseInput.charAt(i + 1) - reverseInput.charAt(i));
                if (inputDiff != reverseInputDiff) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int testCases = in.nextInt();
                for (int i = 0; i < testCases; i++) {
                    if (isFunny(in.next())) {
                        System.out.println("Funny");
                    } else {
                        System.out.println("Not Funny");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
