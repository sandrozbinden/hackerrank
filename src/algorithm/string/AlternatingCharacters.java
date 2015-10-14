/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm.string;

import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class AlternatingCharacters {
    public static class Solution {

        private static int alternatingCharacters(String input) {
            int deleteCount = 0;
            for (int i = 0; i < input.length() - 1; i++) {
                if (input.charAt(i) == input.charAt(i + 1)) {
                    deleteCount = deleteCount + 1;
                }
            }
            return deleteCount;
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int testCases = in.nextInt();
                for (int i = 0; i < testCases; i++) {
                    System.out.println(alternatingCharacters(in.next()));
                }
            }
        }

    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
