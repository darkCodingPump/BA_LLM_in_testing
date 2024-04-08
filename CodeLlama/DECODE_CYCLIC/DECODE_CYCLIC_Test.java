package DECODE_CYCLIC;

import org.junit.Test;
import static org.junit.Assert.*;

public class DECODE_CYCLIC_Test {
    @Test
    public void testDecodeCyclic() {
        String str = "abc";
        String expected = "abc";
        String actual = DECODE_CYCLIC.decode_cyclic(str);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecodeCyclicWithLongerString() {
        String str = "abcdefghijklmnopqrstuvwxyz";
        String expected = "abcdefghijklmnopqrstuvwxyz";
        String actual = DECODE_CYCLIC.decode_cyclic(str);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecodeCyclicWithEmptyString() {
        String str = "";
        String expected = "";
        String actual = DECODE_CYCLIC.decode_cyclic(str);
        assertEquals(expected, actual);
    }
}