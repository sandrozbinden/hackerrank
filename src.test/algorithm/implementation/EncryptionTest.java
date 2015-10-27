/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm.implementation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class EncryptionTest {

    @Test
    public void test() {
        assertEquals("hae and via ecy", new String(Encryption.Solution.encrypt("haveaniceday")));
    }

    @Test
    public void test2() {
        assertEquals("fto ehg ee dd", new String(Encryption.Solution.encrypt("feedthedog")));
    }

    @Test
    public void test3() {
        assertEquals("clu hlt io", new String(Encryption.Solution.encrypt("chillout")));
    }
}
