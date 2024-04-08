package BELOW_THRESHOLD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BELOW_THRESHOLD_Test {
    @Test
    public void testBelowThreshold() {
        int[] l = {1, 2, 4, 10};
        int t = 100;
        assertEquals(true, BELOW_THRESHOLD.below_threshold(l, t));
    }

    @Test
    public void testBelowThresholdWithNonMatchingInput() {
        int[] l = {1, 20, 4, 10};
        int t = 5;
        assertEquals(false, BELOW_THRESHOLD.below_threshold(l, t));
    }

    @Test
    public void testBelowThresholdWithEmptyInput() {
        int[] l = {};
        int t = 100;
        assertEquals(true, BELOW_THRESHOLD.below_threshold(l, t));
    }
}