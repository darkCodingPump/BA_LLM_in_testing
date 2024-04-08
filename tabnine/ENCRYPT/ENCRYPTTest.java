package ENCRYPT;

import org.junit.Test;
import static org.junit.Assert.*;

public class ENCRYPTTest {

    @Test
    public void testEncryptNormal() {
        String expected = "khoor";
        String actual = ENCRYPT.encrypt("hello");
        assertEquals(expected, actual);
    }

    @Test
    public void testEncryptEdge1() {
        String expected = "c";
        String actual = ENCRYPT.encrypt("a");
        assertEquals(expected, actual);
    }

    @Test
    public void testEncryptEdge2() {
        String expected = "b";
        String actual = ENCRYPT.encrypt("z");
        assertEquals(expected, actual);
    }
}