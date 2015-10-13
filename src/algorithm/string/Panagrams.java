/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class Panagrams {
    public static class Solution {

        public static boolean isPanagram(String input) {
        	Set<Character> letterSet = new HashSet<>();
        	for (int i = 0; i < input.length(); i++) {
        		if (Character.isLetter(input.charAt(i))) {
        			letterSet.add(Character.valueOf(Character.toLowerCase(input.charAt(i))));
        		}
        		if (letterSet.size() == 26) {
        			return true;
        		}
        	} 
        	return false;
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                if (isPanagram(in.nextLine())) {
                	System.out.println("pangram");
                } else {
                	System.out.println("not pangram");
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
