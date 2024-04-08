package EVEN_ODD_COUNT;


import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class EVEN_ODD_COUNT_Test {

    @Test
    public void testStandardCase() {
        int[] expected = {1, 1};
        assertArrayEquals(expected, EVEN_ODD_COUNT.even_odd_count(123456789));
    }

    @Test
    public void testEdgeCase1() {
        int[] expected = {0, 0};
        assertArrayEquals(expected, EVEN_ODD_COUNT.even_odd_count(0));
    }

    @Test
    public void testEdgeCase2() {
        int[] expected = {1, 0};
        assertArrayEquals(expected, EVEN_ODD_COUNT.even_odd_count(102));
    }
}