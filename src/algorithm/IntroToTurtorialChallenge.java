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
 * https://www.hackerrank.com/challenges/tutorial-intro
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class IntroToTurtorialChallenge {

    public static class Solution {

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int v = in.nextInt();
                int n = in.nextInt();
                for (int i = 0; i < n; i++) {
                    if (in.nextInt() == v) {
                        System.out.println(i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
