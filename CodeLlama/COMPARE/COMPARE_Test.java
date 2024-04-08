package COMPARE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class COMPARE_Test {

    @Test
    public void testCompare1() {
        int[] game = {1, 2, 3, 4, 5};
        int[] guess = {1, 2, 3, 4, 5};
        int[] expected = {0, 0, 0, 0, 0};
        assertArrayEquals(expected, COMPARE.compare(game, guess));
    }

    @Test
    public void testCompare2() {
        int[] game = {1, 2, 3, 4, 5};
        int[] guess = {2, 3, 4, 5, 6};
        int[] expected = {1, 1, 1, 1, 1};
        assertArrayEquals(expected, COMPARE.compare(game, guess));
    }

    @Test
    public void testCompare3() {
        int[] game = {1, 2, 3, 4, 5};
        int[] guess = {5, 4, 3, 2, 1};
        int[] expected = {4, 2, 0, 2, 4};
        assertArrayEquals(expected, COMPARE.compare(game, guess));
    }
}