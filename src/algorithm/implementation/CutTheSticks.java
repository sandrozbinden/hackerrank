package algorithm.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class CutTheSticks {
    public static class Solution {

        public static void cutTheSticks(List<Integer> stickList) {
            if (stickList.isEmpty()) {
                return;
            } else {
                System.out.println(stickList.size());
                final Integer min = Collections.min(stickList);
                while (stickList.remove(min)) {
                    //emptyt the lst
                }
                cutTheSticks(stickList);
            }
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                List<Integer> stickList = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    stickList.add(in.nextInt());
                }
                Collections.sort(stickList);
                cutTheSticks(stickList);
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
