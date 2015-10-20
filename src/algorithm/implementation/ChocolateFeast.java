package algorithm.implementation;

import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class ChocolateFeast {
    public static class Solution {

        public static int chocolateFeast(int money, int coast, int wrapper) {
           int productBoughtWithMoney = money / coast;
           return productBoughtWithMoney = productBoughtWithMoney + getWrapperChocolate(productBoughtWithMoney, wrapper);
        }

        private static int getWrapperChocolate(int productBought, int wrapper) {
			if (productBought < wrapper) {
				return 0;
			} else {
				int productBoughtWithWrapper = productBought / wrapper;
				int couponsLeft = productBought % wrapper;
				return  productBoughtWithWrapper + getWrapperChocolate(productBoughtWithWrapper + couponsLeft, wrapper);
			}
		}

		public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int testcases = in.nextInt();
                for (int testcase = 0; testcase < testcases; testcase++) {
                	System.out.println(chocolateFeast(in.nextInt(), in.nextInt(), in.nextInt()));
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
