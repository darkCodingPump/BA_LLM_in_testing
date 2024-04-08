package DECIMAL_TO_BINARY;

import org.junit.Test;
import static org.junit.Assert.*;

public class DECIMAL_TO_BINARYTest {

    @Test
    public void testDecimalToBinaryStandardCase() {
        assertEquals("db1011db", DECIMAL_TO_BINARY.decimal_to_binary(5));
    }

    @Test
    public void testDecimalToBinaryEdgeCase1() {
        assertEquals("db0db", DECIMAL_TO_BINARY.decimal_to_binary(0));
    }

    @Test
    public void testDecimalToBinaryEdgeCase2() {
        assertEquals("db111111111111111111111111111111111db", DECIMAL_TO_BINARY.decimal_to_binary(Integer.MAX_VALUE));
    }
}