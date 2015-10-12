package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FullCountingSort {

	public static class Solution {

		public static int quickSortSwapCount = 0;

		public static void countingSort(int listSize, Scanner in) {
			List<List<String>> countingSort = new ArrayList<>(100);
			initArray(countingSort);
			for (int i = 0; i < listSize; i++) {
				int intValue = in.nextInt();
				String stringValue = in.next();
				List<String> list = countingSort.get(intValue);
				if (i >= listSize / 2) {
					list.add(stringValue);
				} else {
					list.add("-");
				}
			}
			printArrayElements(countingSort);
		}

		private static void initArray(List<List<String>> countingSort) {
			for (int i = 0; i < 100; i++) {
				countingSort.add(i, new ArrayList<>());
			}
		}

		static void printArrayElements(List<List<String>> countingSort) {
			StringBuilder result = new StringBuilder();
			for (List<String> list : countingSort) {
				for (String value : list) {
					result.append(value);
					result.append(" ");
				}
			}
			System.out.println(result);
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