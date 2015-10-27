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
public class TimeInWordsTest {

    @Test
    public void test() {
        //        assertEquals("five o' clock", TimeInWords.Solution.timeInWords(5, 0));
        //        assertEquals("one minute past five", TimeInWords.Solution.timeInWords(5, 1));
        //        assertEquals("ten minutes past five", TimeInWords.Solution.timeInWords(5, 10));
        //        assertEquals("half past five", TimeInWords.Solution.timeInWords(5, 30));

        assertEquals("twenty eight minutes past five", TimeInWords.Solution.timeInWords(5, 28));
        assertEquals("twenty minutes to six", TimeInWords.Solution.timeInWords(5, 40));
        assertEquals("quarter to six", TimeInWords.Solution.timeInWords(5, 45));
        assertEquals("thirteen minutes to six", TimeInWords.Solution.timeInWords(5, 47));
    }
}
