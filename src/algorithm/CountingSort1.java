package algorithm;

import java.util.Scanner;

public class CountingSort1 {

	public static class Solution {

		public static int quickSortSwapCount = 0;

		public static void countingSort(int listSize, Scanner in) {
			int[] array = new int[100];
			for (int i = 0; i < listSize; i++) {
				int value = in.nextInt();
				array[value] = array[value] +1;
			}
			printArrayLn(array);
		}

		static void printArrayLn(int[] array) {
			for (int n : array) {
				System.out.print(n + " ");
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