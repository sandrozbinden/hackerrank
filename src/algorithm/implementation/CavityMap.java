package algorithm.implementation;

import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class CavityMap {
    public static class Solution {

        public static void printCavityMap(int[][] cavityMap) {
            for (int i = 0; i < cavityMap.length; i++) {
                StringBuilder line = new StringBuilder();
                for (int j = 0; j < cavityMap.length; j++) {
                    boolean hasLeftNeighbour = j > 0;
                    boolean hasRightNeighbour = j < cavityMap.length - 1;
                    boolean hasTopNeighbour = i > 0;
                    boolean hasBottomNeighbour = i < cavityMap.length - 1;
                    int cell = cavityMap[i][j];
                    if (hasLeftNeighbour && hasRightNeighbour && hasTopNeighbour && hasBottomNeighbour) {
                        int leftNeighbour = cavityMap[i][j - 1];
                        int rightNeighbour = cavityMap[i][j + 1];
                        int topNeighbour = cavityMap[i - 1][j];
                        int bottomNeighbour = cavityMap[i + 1][j];
                        if (cell > leftNeighbour && cell > rightNeighbour && cell > topNeighbour && cell > bottomNeighbour) {
                            line.append("X");
                        } else {
                            line.append(cell);
                        }
                    } else {
                        line.append(cell);
                    }
                }
                System.out.println(line.toString());
            }
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                int[][] cavityMap = new int[n][n];
                for (int i = 0; i < n; i++) {
                    String line = in.next();
                    for (int j = 0; j < n; j++) {
                        cavityMap[i][j] = Character.getNumericValue(line.charAt(j));
                    }
                }
                printCavityMap(cavityMap);
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
