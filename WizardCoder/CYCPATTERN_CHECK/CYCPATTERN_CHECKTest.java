package CYCPATTERN_CHECK;


import org.junit.Test;
import static org.junit.Assert.*;

public class CYCPATTERN_CHECKTest {

    @Test
    public void testStandardCase() {
        assertTrue(CYCPATTERN_CHECK.cycpattern_check("abcabcabc", "abc"));
    }

    @Test
    public void testEdgeCase1() {
        assertTrue(CYCPATTERN_CHECK.cycpattern_check("abcabcabc", ""));
    }

    @Test
    public void testEdgeCase2() {
        assertFalse(CYCPATTERN_CHECK.cycpattern_check("abcabcabc", "def"));
    }
}