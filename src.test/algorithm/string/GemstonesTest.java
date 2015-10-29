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

import com.google.common.collect.Lists;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class GemstonesTest {

    @Test
    public void test() {
        assertEquals(2, Gemstones.Solution.getGemElements(Lists.newArrayList("abcdde", "baccd", "eeabg")));
    }
}
