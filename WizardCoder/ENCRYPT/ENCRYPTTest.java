package ENCRYPT;

import org.junit.Test;
import static org.junit.Assert.*;

public class ENCRYPTTest {

    @Test
    public void testStandardCase() {
        String input = "abc";
        String expected = "cde";
        String actual = ENCRYPT.encrypt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCase1() {
        String input = "xyz";
        String expected = "zab";
        String actual = ENCRYPT.encrypt(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCase2() {
        String input = "123";
        String expected = "123";
        String actual = ENCRYPT.encrypt(input);
        assertEquals(expected, actual);
    }
}