package DECIMAL_TO_BINARY;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DECIMAL_TO_BINARYTest {

    @Test
    public void testStandardCase() {
        assertEquals("db1111db", DECIMAL_TO_BINARY.decimal_to_binary(15));
    }

    @Test
    public void testEqualCase() {
        assertEquals("db100000db", DECIMAL_TO_BINARY.decimal_to_binary(32));
    }

    @Test
    public void testLessCase() {
        assertEquals("db000001db", DECIMAL_TO_BINARY.decimal_to_binary(1));
    }
}