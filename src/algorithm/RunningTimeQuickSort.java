package algorithm;

import java.util.Scanner;

public class RunningTimeQuickSort {

    public static class Solution {
    	
    	public static int  quickSortSwapCount = 0;

		public static void quicksort(int[] ar, int low, int high) {
			if (low < high) {
				int pivotIndex = partition(ar, low, high);
				quicksort(ar, low, pivotIndex -1);
				quicksort(ar, pivotIndex +1, high);
			}
		}
        public static int partition(int[] ar, int low, int high) {
        	int pivotValue = ar[high];
        	int i = low;
        	for (int j = low; j < high; j++) {
        		if (ar[j] <= pivotValue) {
        			swap(ar, i, j);
        			i = i +1;
        		}
        	}
        	swap(ar, i, high);
        	return i;
        }
        
        private static void swap(int[] ar, int i1, int i2) {
        	int tempValue = ar[i1];
        	ar[i1] = ar[i2];
        	ar[i2] = tempValue;
        	quickSortSwapCount = quickSortSwapCount +1;
		}
        
        public static int insertionSort(int[] A) {
            int shifts = 0;
            for (int i = 1; i < A.length; i++) {
                int value = A[i];
                int j = i;
                while (j > 0 && A[j - 1] > value) {
                    A[j] = A[j - 1];
                    j = j - 1;
                    shifts++;
                }
                A[j] = value;
            }
            return shifts;
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                int[] arrayInsertation = new int[n];
                for (int i = 0; i < n; i++) {
                    arrayInsertation[i] = in.nextInt();
                }
                int[] arrayQuickSort = new int[n];
                System.arraycopy(arrayInsertation, 0, arrayQuickSort, 0, arrayInsertation.length );
                int shiftsInsertation = insertionSort(arrayInsertation);
                quickSortSwapCount = 0;
                quicksort(arrayQuickSort, 0, arrayQuickSort.length -1);
                System.out.println(shiftsInsertation - quickSortSwapCount);
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }

}