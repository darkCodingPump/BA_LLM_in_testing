package CLOSEST_INTEGER;

import org.junit.Test;
import static org.junit.Assert.*;

public class CLOSEST_INTEGERTest {

    // Normal test case
    @Test
    public void test_closest_integer_normal() {
        String value = "10";
        int result = CLOSEST_INTEGER.closest_integer(value);
        assertEquals(10, result);
    }

    // Edge case: Number with decimal point
    @Test
    public void test_closest_integer_decimal() {
        String value = "15.3";
        int result = CLOSEST_INTEGER.closest_integer(value);
        assertEquals(15, result);
    }

    // Edge case: Number with decimal point and equidistant from two integers
    @Test
    public void test_closest_integer_equidistant() {
        String value = "14.5";
        int result = CLOSEST_INTEGER.closest_integer(value);
        assertEquals(15, result);
    }
}