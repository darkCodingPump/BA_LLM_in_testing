package ENCODE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ENCODETest {

    @Test
    public void testEncodeStandardCase() {
        String input = "test";
        String expected = "TGST";
        assertEquals(expected, ENCODE.encode(input));
    }

    @Test
    public void testEncodeEdgeCase1() {
        String input = "This is a message";
        String expected = "tHKS KS C MGSSCGG";
        assertEquals(expected, ENCODE.encode(input));
    }

    @Test
    public void testEncodeEdgeCase2() {
        String input = "AaEeIiOoUu";
        String expected = "CcGgKkQqUuWwYy";
        assertEquals(expected, ENCODE.encode(input));
    }
}