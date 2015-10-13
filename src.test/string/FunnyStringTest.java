/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package string;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class FunnyStringTest {

    @Test
    public void testExample1() {
        assertTrue(FunnyString.Solution.isFunny("acxz"));
    }
}
