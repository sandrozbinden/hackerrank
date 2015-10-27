package algorithm.implementation;

import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class Encryption {
    public static class Solution {

        public static String encrypt(String input) {
            input = input.replace(" ", "");
            int rows = (int) Math.floor(Math.sqrt(input.length()));
            int columns = (int) Math.ceil(Math.sqrt(input.length()));
            if (rows * columns < input.length()) {
                rows = rows + 1;
            }
            char[] encryped = new char[rows * columns];
            for (int i = 0; i < input.length(); i++) {
                int row = i / columns;
                int column = i % columns;
                int position = column * rows + row;
                encryped[position] = input.charAt(i);
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < encryped.length; i++) {
                if (i != 0 && i % rows == 0) {
                    result.append(" ");
                }
                if (encryped[i] != '\0') {
                    result.append(encryped[i]);
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                System.out.println(encrypt(in.next()));
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
