package EVEN_ODD_COUNT;

import org.junit.Test;

import static org.junit.Assert.*;

public class EVEN_ODD_COUNTTests {

    @Test
    public void testNormalCase() {
        int[] result = EVEN_ODD_COUNT.even_odd_count(12345);
        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void testEdgeCaseNegativeNumber() {
        int[] result = EVEN_ODD_COUNT.even_odd_count(-123);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testEdgeCaseZero() {
        int[] result = EVEN_ODD_COUNT.even_odd_count(0);
        assertEquals(1, result[0]);
        assertEquals(0, result[1]);
    }
}