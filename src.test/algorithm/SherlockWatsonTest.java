/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class SherlockWatsonTest {

    @Test
    public void test() {
        int[] ar = { 1, 2, 3 };
        int k = 2;
        assertEquals(2, SherlockWatson.Solution.printResult(ar, k, 0));
        assertEquals(3, SherlockWatson.Solution.printResult(ar, k, 1));
        assertEquals(1, SherlockWatson.Solution.printResult(ar, k, 2));
    }

    @Test
    public void testMultipleTimes() {
        int[] ar = { 1, 2, 3 };
        int k = 8;
        assertEquals(2, SherlockWatson.Solution.printResult(ar, k, 0));
        assertEquals(3, SherlockWatson.Solution.printResult(ar, k, 1));
        assertEquals(1, SherlockWatson.Solution.printResult(ar, k, 2));
    }
}
