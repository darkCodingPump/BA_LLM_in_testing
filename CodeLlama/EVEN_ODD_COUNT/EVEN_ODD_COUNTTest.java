package EVEN_ODD_COUNT;

import org.junit.Test;
import static org.junit.Assert.*;

public class EVEN_ODD_COUNTTest {

    @Test
    public void testEvenOddCountNormal() {
        int[] expected = new int[] {1, 1};
        int[] actual = EVEN_ODD_COUNT.even_odd_count(-12);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEvenOddCountEdge1() {
        int[] expected = new int[] {1, 2};
        int[] actual = EVEN_ODD_COUNT.even_odd_count(123);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEvenOddCountEdge2() {
        int[] expected = new int[] {0, 0};
        int[] actual = EVEN_ODD_COUNT.even_odd_count(0);
        assertArrayEquals(expected, actual);
    }
}