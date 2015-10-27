package algorithm.implementation;

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
public class KaprekarNumbers {
    public static class Solution {

        public static List<Integer> getKaprekars(int p, int q) {
            List<Integer> kaprekars = new ArrayList();
            for (int i = p; i <= q; i++) {
                String pow = String.valueOf((long) Math.pow(i, 2));
                String summand1Str = pow.substring(0, pow.length() / 2);
                String summand2Str = pow.substring(pow.length() / 2);
                int summand1 = summand1Str.isEmpty() ? 0 : Integer.parseInt(summand1Str);
                int summand2 = summand2Str.isEmpty() ? 0 : Integer.parseInt(summand2Str);
                int result = summand1 + summand2;
                if (result == i) {
                    kaprekars.add(i);
                }
            }
            return kaprekars;
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int p = in.nextInt();
                int q = in.nextInt();
                StringBuilder builder = new StringBuilder();
                List<Integer> kaprekars = getKaprekars(p, q);
                for (long kaprekar : kaprekars) {
                    builder.append(kaprekar);
                    builder.append(" ");
                }
                if (builder.length() == 0) {
                    builder.append("INVALID RANGE");
                }
                System.out.println(builder.toString());
            }
        }

    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
