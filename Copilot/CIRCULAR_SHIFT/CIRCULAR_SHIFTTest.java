package CIRCULAR_SHIFT;

import org.junit.Test;
import static org.junit.Assert.*;

public class CIRCULAR_SHIFTTest {

    // Test case for normal input
    @Test
    public void test_circular_shift_normal() {
        int x = 12345;
        int shift = 2;
        String expected = "45123";
        String result = CIRCULAR_SHIFT.circular_shift(x, shift);
        assertEquals(expected, result);
    }

    // Test case for edge case when shift is greater than the number of digits
    @Test
    public void test_circular_shift_shift_greater_than_digits() {
        int x = 12345;
        int shift = 6;
        String expected = "54321";
        String result = CIRCULAR_SHIFT.circular_shift(x, shift);
        assertEquals(expected, result);
    }

    // Test case for edge case when shift is equal to the number of digits
    @Test
    public void test_circular_shift_shift_equal_to_digits() {
        int x = 12345;
        int shift = 5;
        String expected = "12345";
        String result = CIRCULAR_SHIFT.circular_shift(x, shift);
        assertEquals(expected, result);
    }
}