package algorithm.implementation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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

        public static void cutTheSticks(Map<Integer, Integer> stickMap) {
            if (stickMap.isEmpty()) {
                return;
            } else {
                System.out.println(stickMap.values().stream().mapToInt(Integer::intValue).sum());
                stickMap.remove(Collections.min(stickMap.keySet()));
                cutTheSticks(stickMap);
            }

        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                Map<Integer, Integer> stickMap = new HashMap<>();
                for (int i = 0; i < n; i++) {
                    int stick = in.nextInt();
                    if (stickMap.containsKey(stick)) {
                        stickMap.put(stick, stickMap.get(stick) + 1);
                    } else {
                        stickMap.put(stick, 1);
                    }
                }
                cutTheSticks(stickMap);
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
