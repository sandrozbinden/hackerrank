package algorithm;

import static org.junit.Assert.*;

import org.junit.Test;


public class RunningTimeQuickSortTest {

	@Test
	public void testInseratationSort() {
		int[] ar = {1, 3, 9, 8, 2, 7, 5};
		assertEquals(9, RunningTimeQuickSort.Solution.insertionSort(ar));
	}
	
	@Test
	public void testQuickSort() {
		int[] ar = {1, 3, 9, 8, 2, 7, 5};
		RunningTimeQuickSort.Solution.quickSortSwapCount = 0;
		RunningTimeQuickSort.Solution.quicksort(ar, 0, ar.length -1);
		assertEquals(8, RunningTimeQuickSort.Solution.quickSortSwapCount);
	}
}
