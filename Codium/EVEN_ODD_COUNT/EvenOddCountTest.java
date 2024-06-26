package EVEN_ODD_COUNT;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

public class EvenOddCountTest {


    // Should return (0, 0) when given 0 as input.
    @Test
    public void test_zero_input() {
        int[] result = EVEN_ODD_COUNT.even_odd_count(0);
        assertArrayEquals(new int[]{0, 0}, result);
    }

    // Should handle negative input numbers correctly and return the correct tuple.
    @Test
    public void test_negative_input() {
        int[] result = EVEN_ODD_COUNT.even_odd_count(-12);
        assertArrayEquals(new int[]{1, 1}, result);
    
        result = EVEN_ODD_COUNT.even_odd_count(123);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    // Should handle large input numbers correctly and return the correct tuple.
    @Test
    public void test_large_input_numbers() {
        int[] result = EVEN_ODD_COUNT.even_odd_count(1234567890);
        assertArrayEquals(new int[]{5, 5}, result);
    }
}