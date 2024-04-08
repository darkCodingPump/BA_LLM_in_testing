package DECIMAL_TO_BINARY;

import org.junit.Test;
import static org.junit.Assert.*;

public class DECIMAL_TO_BINARY_Test {
    @Test
    public void testDecimalToBinary() {
        int decimal = 15;
        String expected = "db1111db";
        String actual = DECIMAL_TO_BINARY.decimal_to_binary(decimal);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecimalToBinaryWithLargerNumber() {
        int decimal = 32;
        String expected = "db100000db";
        String actual = DECIMAL_TO_BINARY.decimal_to_binary(decimal);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecimalToBinaryWithZero() {
        int decimal = 0;
        String expected = "db000000db";
        String actual = DECIMAL_TO_BINARY.decimal_to_binary(decimal);
        assertEquals(expected, actual);
    }
}