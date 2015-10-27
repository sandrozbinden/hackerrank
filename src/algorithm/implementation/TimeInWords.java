package algorithm.implementation;

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
public class TimeInWords {
    public static class Solution {

        private static Map<Integer, String> numberMap = getNumberMap();
        private static Map<Integer, String> numberTenMap = getNumberTensMap();

        public static String timeInWords(int h, int m) {

            if (m == 0) {
                return numberMap.get(h) + " o' clock";
            } else if (m == 15) {
                return "quarter past " + numberMap.get(h);
            } else if (m == 30) {
                return "half past " + numberMap.get(h);
            } else if (m == 45) {
                return "quarter to " + numberMap.get(h + 1);
            } else {
                StringBuilder time = new StringBuilder();
                time.append(getTimeInMinutes(m));
                time.append(" ");
                time.append(getMinuteOrMinutes(m));
                time.append(" ");
                time.append(getPastOrTime(m));
                time.append(" ");
                time.append(getHours(h, m));
                return time.toString();
            }

        }

        private static String getHours(int h, int m) {
            if (m < 30) {
                return numberMap.get(h);
            } else {
                return numberMap.get(h + 1);
            }
        }

        private static String getTimeInMinutes(int m) {
            int time = m < 30 ? m : 60 - m;
            if (time < 20) {
                return getNumberMap().get(time);
            } else {
                if (time % 10 == 0) {
                    return numberTenMap.get(time / 10);
                } else {
                    return numberTenMap.get(time / 10) + " " + numberMap.get(time % 10);
                }
            }
        }

        private static String getMinuteOrMinutes(int m) {
            int time = m < 30 ? m : 60 - m;
            if (time < 2) {
                return "minute";
            } else {
                return "minutes";
            }
        }

        private static String getPastOrTime(int m) {
            if (m < 30) {
                return "past";
            } else {
                return "to";
            }
        }

        private static Map<Integer, String> getNumberTensMap() {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "ten");
            map.put(2, "twenty");
            map.put(3, "thirty");
            map.put(4, "forty");
            map.put(5, "fifty");
            map.put(6, "sixty");
            return map;
        }

        private static Map<Integer, String> getNumberMap() {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "one");
            map.put(2, "two");
            map.put(3, "three");
            map.put(4, "four");
            map.put(5, "five");
            map.put(6, "six");
            map.put(7, "seven");
            map.put(8, "eight");
            map.put(9, "nine");
            map.put(10, "ten");
            map.put(11, "eleven");
            map.put(12, "twelve");
            map.put(13, "thirteen");
            map.put(14, "fourteen");
            map.put(15, "fifteen");
            map.put(16, "sixteen");
            map.put(17, "seventeen");
            map.put(18, "eighteen");
            map.put(19, "nineteen");
            return map;
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int h = in.nextInt();
                int m = in.nextInt();
                System.out.println(timeInWords(h, m));
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
