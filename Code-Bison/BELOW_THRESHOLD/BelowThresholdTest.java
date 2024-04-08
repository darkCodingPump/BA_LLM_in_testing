package BELOW_THRESHOLD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BelowThresholdTest {

    @Test
    public void testNormal() {
        int[] l = {1, 2, 4, 10};
        assertTrue(BELOW_THRESHOLD.below_threshold(l, 100));
    }

    @Test
    public void testEdgeCase1() {
        int[] l = {1, 20, 4, 10};
        assertFalse(BELOW_THRESHOLD.below_threshold(l, 5));
    }

    @Test
    public void testEdgeCase2() {
        int[] l = {};
        assertTrue(BELOW_THRESHOLD.below_threshold(l, 100));
    }
}