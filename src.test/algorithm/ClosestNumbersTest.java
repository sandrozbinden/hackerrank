package algorithm;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class ClosestNumbersTest {

	@Test
	public void test() {
		int[] sortedArray = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854 };
		Arrays.sort(sortedArray);
		assertEquals(new ClosestNumbers.Pair(-20, 30), ClosestNumbers.Solution.closestsNumber(sortedArray).get(0));
	}
}
