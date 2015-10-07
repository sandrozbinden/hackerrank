package algorithm;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InsertionSortPart1 {

    public static class Solution {
        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int arrayLength = in.nextInt();
                int array[] = new int[arrayLength];
                fillIntArrayFromScanner(in, array);
                int unsortedIndex = array.length - 1;
                int unsortedValue = array[unsortedIndex];
                int lastSortedIndex = array.length - 2;
                while (lastSortedIndex >= 0 && array[lastSortedIndex] > unsortedValue) {
                    shiftRight(array, lastSortedIndex);
                    printArray(array, " ");
                    lastSortedIndex = lastSortedIndex - 1;
                }
                array[lastSortedIndex + 1] = unsortedValue;
                printArray(array, " ");
            }
        }
    }

    private static void fillIntArrayFromScanner(Scanner in, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
    }

    private static void shiftRight(int[] array, int index) {
        array[index + 1] = array[index];
    }

    private static void printArray(int[] array, String delimiter) {
		System.out.println(Arrays.stream(array).mapToObj(v -> String.valueOf(v)).collect(Collectors.joining(delimiter)));
	}

    public static void main(String[] args) {
        Solution.main(null);
    }
}