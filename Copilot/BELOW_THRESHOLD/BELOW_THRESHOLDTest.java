package BELOW_THRESHOLD;

import org.junit.Test;
import static org.junit.Assert.*;

public class BELOW_THRESHOLDTest {

    // Test with normal input where all numbers are below the threshold
    @Test
    public void test_below_threshold_all_below() {
        int[] l = {1, 2, 4, 10};
        int t = 100;
        boolean result = BELOW_THRESHOLD.below_threshold(l, t);
        assertTrue(result);
    }

    // Test with normal input where at least one number is equal to the threshold
    @Test
    public void test_below_threshold_one_equal() {
        int[] l = {1, 20, 4, 10};
        int t = 5;
        boolean result = BELOW_THRESHOLD.below_threshold(l, t);
        assertFalse(result);
    }

    // Test with edge case where all numbers are equal to the threshold
    @Test
    public void test_below_threshold_all_equal() {
        int[] l = {5, 5, 5, 5};
        int t = 5;
        boolean result = BELOW_THRESHOLD.below_threshold(l, t);
        assertFalse(result);
    }
}