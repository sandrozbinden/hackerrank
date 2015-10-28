/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm.string;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class GameofThronesITest {

    @Test
    public void test1() {
        assertTrue(GameofThronesI.Solution.isAnagramAPalindrom("aaabbbb"));
    }

    @Test
    public void test2() {
        assertFalse(GameofThronesI.Solution.isAnagramAPalindrom("cdefghmnopqrstuvw"));
    }

    @Test
    public void test3() {
        assertTrue(GameofThronesI.Solution.isAnagramAPalindrom("cdcdcdcdeeeef"));
    }

}
