/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm.implementation;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class KaprekarNumbersTest {

    @Test
    public void testKaprekar() {
        List<Integer> kaprekars = KaprekarNumbers.Solution.getKaprekars(1, 100);
        assertEquals(1, get(kaprekars, 0));
        assertEquals(9, get(kaprekars, 1));
        assertEquals(45L, get(kaprekars, 2));
        assertEquals(55L, get(kaprekars, 3));
        assertEquals(99L, get(kaprekars, 4));
    }

    private int get(List<Integer> kaprekars, int i) {
        return kaprekars.get(i);
    }
}
