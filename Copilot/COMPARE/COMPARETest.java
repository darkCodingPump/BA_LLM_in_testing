package COMPARE;

import org.junit.Test;
import static org.junit.Assert.*;

public class COMPARETest {

    // Normal case: Both game and guess arrays have the same length.
    @Test
    public void test_compare_normalCase() {
        int[] game = {1, 2, 3};
        int[] guess = {4, 5, 6};
        int[] expected = {3, 3, 3};
        int[] result = COMPARE.compare(game, guess);
        assertArrayEquals(expected, result);
    }

    // Edge case: Empty arrays.
    @Test
    public void test_compare_emptyArrays() {
        int[] game = {};
        int[] guess = {};
        int[] expected = {};
        int[] result = COMPARE.compare(game, guess);
        assertArrayEquals(expected, result);
    }

    // Edge case: Arrays with different lengths.
     @Test
    public void test_compare_differentLengths() {
        int[] game = {1, 2, 3};
        int[] guess = {4, 5};
        int[] expected = {3, 3};
        int[] result = COMPARE.compare(game, guess);
        assertArrayEquals(expected, result);
    } 
}