package ENCRYPT;

import org.junit.Test;
import static org.junit.Assert.*;

public class ENCRYPTTest {

    @Test
    public void testEncryptNormal() {
        String expected = "lm";
        String actual = ENCRYPT.encrypt("hi");
        assertEquals(expected, actual);
    }

    @Test
    public void testEncryptEdge1() {
        String expected = "ewhjklnop";
        String actual = ENCRYPT.encrypt("asdfghjkl");
        assertEquals(expected, actual);
    }

    @Test
    public void testEncryptEdge2() {
        String expected = "kj";
        String actual = ENCRYPT.encrypt("gf");
        assertEquals(expected, actual);
    }
}