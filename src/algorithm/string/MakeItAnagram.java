/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class MakeItAnagram {
    public static class Solution {

        public static int makeAnagram(String inputA, String inputB) {
            List<Integer> listA = inputA.chars().parallel().boxed().collect(Collectors.toList());
            List<Integer> listB = new ArrayList<>();
            for (Integer valueB : inputB.chars().parallel().boxed().collect(Collectors.toList())) {
                if (!listA.remove(valueB)) {
                    listB.add(valueB);
                }
            }
            return listA.size() + listB.size();
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                System.out.println(makeAnagram(in.next(), in.next()));
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
