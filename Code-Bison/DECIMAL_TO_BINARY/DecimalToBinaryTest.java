package DECIMAL_TO_BINARY;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DECIMAL_TO_BINARYTest {

    @Test
    void decimal_to_binary_normal_case() {
        String result = DECIMAL_TO_BINARY.decimal_to_binary(15);
        assertEquals("db1111db", result);
    }

    @Test
    void decimal_to_binary_edge_case_zero() {
        String result = DECIMAL_TO_BINARY.decimal_to_binary(0);
        assertEquals("db0db", result);
    }

    @Test
    void decimal_to_binary_edge_case_negative() {
        String result = DECIMAL_TO_BINARY.decimal_to_binary(-1);
        assertEquals("db11111111111111111111111111111111db", result);
    }
}