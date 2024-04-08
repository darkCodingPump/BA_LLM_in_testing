package ENCODE;

import org.junit.Test;
import static org.junit.Assert.*;

public class ENCODETest {

    @Test
    public void testEncodeNormal() {
        String expected = "TGST";
        String actual = ENCODE.encode("test");
        assertEquals(expected, actual);
    }

    @Test
    public void testEncodeEdge() {
        String expected = "tHKS KS C MGSSCGG";
        String actual = ENCODE.encode("This is a message");
        assertEquals(expected, actual);
    }

    @Test
    public void testEncodeEdge2() {
        String expected = "tHKS KS CW";
        String actual = ENCODE.encode("This is a message, a message");
        assertEquals(expected, actual);
    }
}