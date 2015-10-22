/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm.implementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class GridSearchTest {

    @Test
    public void test() throws FileNotFoundException {
        try (Scanner in = new Scanner(new File("d:\\temp\\input05.txt"))) {
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
                if (GridSearch.Solution.gridSearch(lines.toString(), columns, patterns)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

    }
}
