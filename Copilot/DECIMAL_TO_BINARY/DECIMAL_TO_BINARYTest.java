package DECIMAL_TO_BINARY;

import org.junit.Test;
import static org.junit.Assert.*;

public class DECIMAL_TO_BINARYTest {

    // Normal test case
    @Test
    public void test_decimal_to_binary_normal() {
        int decimal = 15;
        String expected = "db1111db";
        String result = DECIMAL_TO_BINARY.decimal_to_binary(decimal);
        assertEquals(expected, result);
    }

    // Edge test case: Minimum input value
    @Test
    public void test_decimal_to_binary_min() {
        int decimal = 0;
        String expected = "db0db";
        String result = DECIMAL_TO_BINARY.decimal_to_binary(decimal);
        assertEquals(expected, result);
    }

    // Edge test case: Maximum input value
    @Test
    public void test_decimal_to_binary_max() {
        int decimal = Integer.MAX_VALUE;
        String expected = "db" + Integer.toBinaryString(decimal) + "db";
        String result = DECIMAL_TO_BINARY.decimal_to_binary(decimal);
        assertEquals(expected, result);
    }
}