/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class Gemstones {
    public static class Solution {

        public static int getGemElements(List<String> rocks) {
            Set<Integer> genElements = null;
            for (String rock : rocks) {
                if (genElements == null) {
                    genElements = new HashSet<>();
                    genElements = rock.chars().parallel().boxed().collect(Collectors.toSet());
                } else {
                    Set<Integer> setA = new HashSet<>(genElements);
                    Set<Integer> setB = rock.chars().parallel().boxed().collect(Collectors.toSet());
                    setA.removeAll(setB);
                    genElements.removeAll(setA);
                }
            }
            return genElements == null ? 0 : genElements.size();
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                List<String> rocks = new ArrayList<>();
                int rockCount = in.nextInt();
                for (int i = 0; i < rockCount; i++) {
                    rocks.add(in.next());
                }
                System.out.println(getGemElements(rocks));
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
