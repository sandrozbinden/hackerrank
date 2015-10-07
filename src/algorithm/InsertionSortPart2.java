package algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InsertionSortPart2 {

    public static class Solution {
        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int arrayLength = in.nextInt();
                int array[] = new int[arrayLength];
                fillIntArrayFromScanner(in, array);
                for (int i = 1; i < array.length; i++) {
                    int unsortedValue = array[i];
                    int j = i;
                    while (j > 0 && array[j - 1] > unsortedValue) {
                        array[j] = array[j - 1];
                        j--;
                    }
                    array[j] = unsortedValue;
                    printArray(array, " ");
                }
            }
        }
    }

    private static void fillIntArrayFromScanner(Scanner in, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
    }

    private static void printArray(int[] array, String delimiter) {
        System.out.println(Arrays.stream(array).mapToObj(v -> String.valueOf(v)).collect(Collectors.joining(delimiter)));
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}