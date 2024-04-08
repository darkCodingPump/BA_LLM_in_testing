package COMPARE;

import org.junit.Test;
import static org.junit.Assert.*;

public class COMPARETest {

    @Test
    public void testCompareStandardCase() {
        int[] game = {1, 2, 3, 4};
        int[] guess = {1, 2, 3, 4};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, COMPARE.compare(game, guess));
    }

    @Test
    public void testCompareEdgeCase1() {
        int[] game = {1, 2, 3, 4};
        int[] guess = {4, 3, 2, 1};
        int[] expected = {3, 1, 1, 3};
        assertArrayEquals(expected, COMPARE.compare(game, guess));
    }

    @Test
    public void testCompareEdgeCase2() {
        int[] game = {1, 2, 3, 4};
        int[] guess = {0, 0, 0, 0};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, COMPARE.compare(game, guess));
    }
}