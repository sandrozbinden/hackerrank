package algorithm.implementation;

import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class CesarCipher {
    public static class Solution {
    	
    	private static final char[] alphabetLower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    	private static final char[] alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        public static String cesarCipher(String input, int rotation) {
        	StringBuilder result = new StringBuilder();
        	for (char c : input.toCharArray()) {
        		if (Character.isLetter(c) && Character.isUpperCase(c)) {
        			result.append(cesarCipher(c, alphabetUpper, rotation));
        		} else if (Character.isLetter(c) && Character.isLowerCase(c)) {
        			result.append(cesarCipher(c, alphabetLower, rotation));
        		} else {
        			result.append(c);
        		}
        	}
        	return result.toString();
        }

		private static char cesarCipher(char character,char[] array, int rotation) {
			int index = character -array[0] ;
			return array[(index + rotation) % array.length];
		}

		public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
            	in.nextInt();
                System.out.println(cesarCipher(in.next(), in.nextInt()));
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
