package DECODE_CYCLIC;


import org.junit.Test;
import static org.junit.Assert.*;

public class DECODE_CYCLIC_Test {

    @Test
    public void testDecodeCyclic() {
        String str = "abcdef";
        String expected = "bcaefd";
        assertEquals(expected, DECODE_CYCLIC.decode_cyclic(str));
    }

    @Test
    public void testDecodeCyclicEdgeCase1() {
        String str = "";
        String expected = "";
        assertEquals(expected, DECODE_CYCLIC.decode_cyclic(str));
    }

    @Test
    public void testDecodeCyclicEdgeCase2() {
        String str = "a";
        String expected = "a";
        assertEquals(expected, DECODE_CYCLIC.decode_cyclic(str));
    }
}