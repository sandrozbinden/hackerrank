package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers {

	public static class Solution {

		public static List<Pair> closestsNumber(int[] sortedArray) {
			List<Pair> closestPairs = new ArrayList<Pair>();
			for (int i = 0; i < sortedArray.length - 1; i++) {
				Pair pair = new Pair(sortedArray[i], sortedArray[i + 1]);
				if (closestPairs.isEmpty() || closestPairs.get(0).hasSameDifference(pair)) {
					closestPairs.add(pair);
				} else if (closestPairs.get(0).hasBiggerDifference(pair)) {
					closestPairs.clear();
					closestPairs.add(pair);
				}
			}
			print(closestPairs);
			return closestPairs;
		}

		private static void print(List<Pair> closestPairs) {
			StringBuilder result = new StringBuilder();
			for (Pair pair : closestPairs) {
				result.append(pair.print() + " ");
			}
			System.out.println(result);
		}

		public static void main(String[] args) {
			try (Scanner in = new Scanner(System.in)) {
				int n = in.nextInt();
				int[] ar = new int[n];
				for (int i = 0; i < n; i++) {
					ar[i] = in.nextInt();
				}
				Arrays.sort(ar);
				closestsNumber(ar);
			}
		}
	}

	public static class Pair {
		int left;
		int right;

		public Pair(int left, int right) {
			this.left = left;
			this.right = right;
		}

		public boolean hasBiggerDifference(Pair pair) {
			return getDifference() > pair.getDifference();
		}

		public boolean hasSameDifference(Pair pair) {
			return getDifference() == pair.getDifference();
		}

		public int getDifference() {
			return Math.abs(left - right);
		}

		public String print() {
			return left + " " + right;
		}

		@Override
		public String toString() {
			return left + " " + right + " difference:" + getDifference();
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + left;
			result = prime * result + right;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (left != other.left)
				return false;
			if (right != other.right)
				return false;
			return true;
		}
	}

	public static void main(String[] args) {
		Solution.main(null);
	}

}