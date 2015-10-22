/* ============================================================================
 * Copyright (c) 2015 Imagic Bildverarbeitung AG, CH-8152 Glattbrugg.
 * All rights reserved.
 *
 * http://www.imagic.ch/
 * ============================================================================
 */
package algorithm.implementation;

import java.util.Random;

import org.junit.Test;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class CavityMapTest {

    @Test
    public void test() {
        int[][] map = new int[10][10];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = new Random().nextInt(9);
            }
        }
        CavityMap.Solution.printCavityMap(map);
    }

}
