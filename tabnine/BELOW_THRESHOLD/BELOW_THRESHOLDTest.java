package BELOW_THRESHOLD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BELOW_THRESHOLDTest {

    @Test
    public void testBelowThresholdStandardCase() {
        int[] list = {1, 2, 4, 10};
        int threshold = 100;
        assertTrue(BELOW_THRESHOLD.below_threshold(list, threshold));
    }

    @Test
    public void testBelowThresholdEdgeCase1() {
        int[] list = {1, 20, 4, 10};
        int threshold = 5;
        assertFalse(BELOW_THRESHOLD.below_threshold(list, threshold));
    }

    @Test
    public void testBelowThresholdEdgeCase2() {
        int[] list = {};
        int threshold = 100;
        assertTrue(BELOW_THRESHOLD.below_threshold(list, threshold));
    }
}