package ENCODE;

import org.junit.Test;
import static org.junit.Assert.*;

public class ENCODETest {

    @Test
    public void testStandardCase() {
        String message = "Hello World";
        String expected = "hGllq Vqnf";
        assertEquals(expected, ENCODE.encode(message));
    }

    @Test
    public void testEdgeCase1() {
        String message = "";
        String expected = "";
        assertEquals(expected, ENCODE.encode(message));
    }

    @Test
    public void testEdgeCase2() {
        String message = "1234567890";
        String expected = "1234567890";
        assertEquals(expected, ENCODE.encode(message));
    }
}