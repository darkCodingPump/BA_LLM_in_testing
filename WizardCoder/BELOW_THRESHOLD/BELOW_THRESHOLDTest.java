package BELOW_THRESHOLD;

import org.junit.Test;
import static org.junit.Assert.*;

public class BELOW_THRESHOLDTest {

    @Test
    public void testStandardCase() {
        int[] list = {1, 2, 4, 10};
        int threshold = 100;
        assertTrue(BELOW_THRESHOLD.below_threshold(list, threshold));
    }

    @Test
    public void testEdgeCase1() {
        int[] list = {1, 20, 4, 10};
        int threshold = 5;
        assertFalse(BELOW_THRESHOLD.below_threshold(list, threshold));
    }

    @Test
    public void testEdgeCase2() {
        int[] list = {};
        int threshold = 100;
        assertTrue(BELOW_THRESHOLD.below_threshold(list, threshold));
    }
}