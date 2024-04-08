package COMPARE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class COMPARETest {

    @Test
    public void testStandardCase() {
        int[] game = {10, 5, 8, 12};
        int[] guess = {11, 4, 9, 11};
        int[] expectedResult = {1, 1, 1, 1};
        int[] result = COMPARE.compare(game, guess);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testEqualCase() {
        int[] game = {10, 5, 8, 12};
        int[] guess = {10, 5, 8, 12};
        int[] expectedResult = {0, 0, 0, 0};
        int[] result = COMPARE.compare(game, guess);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testLessCase() {
        int[] game = {10, 5, 8, 12};
        int[] guess = {10, 6, 8, 13};
        int[] expectedResult = {1, 1, 0, 1};
        int[] result = COMPARE.compare(game, guess);
        assertArrayEquals(expectedResult, result);
    }
}