package DECODE_CYCLIC;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DECODE_CYCLICTest {

    @Test
    public void testDecodeCyclicStandardCase() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String expected = "bcaodefhgilnopqrstuvwxyz";
        assertEquals(expected, DECODE_CYCLIC.decode_cyclic(input));
    }

    @Test
    public void testDecodeCyclicEdgeCase1() {
        String input = "abc";
        String expected = "bca";
        assertEquals(expected, DECODE_CYCLIC.decode_cyclic(input));
    }

    @Test
    public void testDecodeCyclicEdgeCase2() {
        String input = "a";
        String expected = "a";
        assertEquals(expected, DECODE_CYCLIC.decode_cyclic(input));
    }
}