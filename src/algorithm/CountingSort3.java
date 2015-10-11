package algorithm;

import java.util.Scanner;

public class CountingSort3 {

	public static class Solution {

		public static int quickSortSwapCount = 0;

		public static void countingSort(int listSize, Scanner in) {
			int[] array = new int[100];
			for (int i = 0; i < listSize; i++) {
				int value = in.nextInt();
				in.next();
				array[value] = array[value] + 1;
			}
			printArrayElements(array);
		}

		static void printArrayElements(int[] array) {
			int counter = 0;
			for (int i = 0; i < array.length; i++) {
				counter = counter + array[i];
				System.out.print(counter + " ");
			}
			System.out.print(System.lineSeparator());
		}

		public static void main(String[] args) {
			try (Scanner in = new Scanner(System.in)) {
				int n = in.nextInt();
				countingSort(n, in);
			}
		}
	}

	public static void main(String[] args) {
		Solution.main(null);
	}

}