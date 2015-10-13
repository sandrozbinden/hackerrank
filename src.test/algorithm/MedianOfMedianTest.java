/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class MedianOfMedianTest {

    @Test
    public void quickSortInplaceMedian() {
        int ar[] = { 0, 1, 2, 3, 6, 4, 5 };
        assertEquals(3, MedianOfMedian.Solution.medianInplaceQuickSort(ar, 0, ar.length - 1));
    }

    @Test
    public void quickSortInplaceMedianLowest() {
        int ar[] = { 3, 1, 2, 0, 6, 4, 5 };
        assertEquals(3, MedianOfMedian.Solution.medianInplaceQuickSort(ar, 0, ar.length - 1));
    }

    @Test
    public void quickSortInplaceMedianHighest() {
        int ar[] = { 3, 1, 2, 0, 6, 4, 5 };
        assertEquals(3, MedianOfMedian.Solution.medianInplaceQuickSort(ar, 0, ar.length - 1));
    }

    @Test
    public void quickSortInplaceMedianNegative() {
        int ar[] = { -3, 1, -2, 0, 6, 4, -5 };
        assertEquals(0, MedianOfMedian.Solution.medianInplaceQuickSort(ar, 0, ar.length - 1));
    }

    @Test
    public void quickSortInplaceMedianRandomFailed() {
        int ar[] = { 5597, -4233, -4936, -3423, -9644, 5670, 8215, -4411, 8344, 5564, -61, 7911, -649 };
        int javaSort[] = new int[ar.length];
        System.arraycopy(ar, 0, javaSort, 0, ar.length);
        Arrays.sort(javaSort);
        assertEquals(javaSort[javaSort.length / 2], MedianOfMedian.Solution.medianInplaceQuickSort(ar, 0, ar.length - 1));
    }

    @Test
    public void quickSortInplaceMedianRandomTest() {
        Random random = new Random();
        int ar[] = new int[random.nextInt(1000) + 1];
        int copy[] = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            int j = random.nextBoolean() == true ? 1 : -1;
            ar[i] = random.nextInt(10000) * j;
        }
        System.arraycopy(ar, 0, copy, 0, ar.length);
        Arrays.sort(copy);
        printArrayLn(ar);
        assertEquals(copy[copy.length / 2], MedianOfMedian.Solution.medianInplaceQuickSort(ar, 0, ar.length - 1));
    }

    static void printArrayLn(int[] ar) {
        for (int n : ar) {
            System.out.print(n + ",");
        }
        System.out.print(System.lineSeparator());
    }
}
