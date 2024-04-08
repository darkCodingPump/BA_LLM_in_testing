package EVEN_ODD_COUNT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EVEN_ODD_COUNTTest {

    @Test
    public void testEvenOddCountNormal() {
        int[] expected = {1, 2};
        int[] actual = EVEN_ODD_COUNT.even_odd_count(123);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEvenOddCountEdge1() {
        int[] expected = {0, 1};
        int[] actual = EVEN_ODD_COUNT.even_odd_count(1024);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEvenOddCountEdge2() {
        int[] expected = {1, 0};
        int[] actual = EVEN_ODD_COUNT.even_odd_count(1023);
        assertArrayEquals(expected, actual);
    }
}