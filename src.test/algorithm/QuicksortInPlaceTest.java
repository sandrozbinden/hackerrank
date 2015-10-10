package algorithm;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class QuicksortInPlaceTest  {

	@Test
	public void test() {
		int[] ar = {1, 3, 9, 8, 2, 7, 5};
		int[] dest = new int[ar.length];
		System.arraycopy( ar, 0, dest, 0, ar.length );
		Arrays.sort(dest);
		QuicksortInPlace.Solution.quicksort(ar, 0, ar.length -1);
		assertTrue(Arrays.equals(ar, dest));
	}
}
