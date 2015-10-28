/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class GameofThronesI {
    public static class Solution {

        public static boolean isAnagramAPalindrom(String input) {
            Map<Character, Boolean> letterMap = new HashMap<>();
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                letterMap.computeIfPresent(currentChar, (k, v) -> !v);
                letterMap.computeIfAbsent(currentChar, k -> false);
            }
            if (letterMap.values().stream().filter(b -> b == false).count() > 1) {
                return false;
            } else {
                return true;
            }
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                if (isAnagramAPalindrom(in.nextLine())) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
