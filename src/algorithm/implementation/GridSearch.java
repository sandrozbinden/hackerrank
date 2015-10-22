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
public class GridSearch {
    public static class Solution {

        public static boolean gridSearch(String lines, int columns, List<String> patterns) {
            String start = patterns.get(0);
            int indexOf = getNextIndexOf(lines, columns, start, 0);
            while (indexOf != -1) {
                int startRow = indexOf / columns;
                int startColumn = indexOf % columns;
                boolean containsPattern = true;
                for (String pattern : patterns) {
                    int startPattern = startRow * columns + startColumn;
                    int endPattern = startPattern + pattern.length();
                    if (endPattern > lines.length() || !lines.substring(startPattern, endPattern).equals(pattern)) {
                        containsPattern = false;
                        break;
                    }
                    startRow = startRow + 1;
                }
                if (containsPattern) {
                    return true;
                }
                indexOf = getNextIndexOf(lines, columns, start, indexOf + 1);

            }
            return false;
        }

        private static int getNextIndexOf(String lines, int columns, String start, int fromIndex) {
            int indexOf = lines.indexOf(start, fromIndex);
            while (indexOf % columns + start.length() >= columns) {
                fromIndex = indexOf + 1;
                indexOf = lines.indexOf(start, fromIndex);
            }
            return indexOf;
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int t = in.nextInt();
                for (int i = 0; i < t; i++) {
                    StringBuilder lines = new StringBuilder();
                    List<String> patterns = new ArrayList();
                    int rows = in.nextInt();
                    int columns = in.nextInt();
                    for (int j = 0; j < rows; j++) {
                        lines.append(in.next());
                    }
                    int patternRows = in.nextInt();
                    int patternColumns = in.nextInt();
                    for (int j = 0; j < patternRows; j++) {
                        patterns.add(in.next());
                    }
                    if (gridSearch(lines.toString(), columns, patterns)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
