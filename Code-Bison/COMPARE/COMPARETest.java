package COMPARE;

import org.junit.Test;
import static org.junit.Assert.*;

public class COMPARETest {

    @Test
    public void testNormalCase1() {
        // Test case 1: Normal case
        int[] game = {1, 2, 3, 4, 5};
        int[] guess = {2, 3, 4, 5, 6};
        int[] expected = {1, 1, 0, 1, 1};
        assertArrayEquals(expected, COMPARE.compare(game, guess));
    }

    @Test
    public void testEdgeCase1() {
        // Edge case 1: Empty arrays
        int[] game = {};
        int[] guess = {};
        int[] expected = {};
        assertArrayEquals(expected, COMPARE.compare(game, guess));
    }

    @Test
    public void testEdgeCase2() {
        // Edge case 2: All guesses are correct
        int[] game = {1, 2, 3, 4, 5};
        int[] guess = {1, 2, 3, 4, 5};
        int[] expected = {0, 0, 0, 0, 0};
        assertArrayEquals(expected, COMPARE.compare(game, guess));
    }
}