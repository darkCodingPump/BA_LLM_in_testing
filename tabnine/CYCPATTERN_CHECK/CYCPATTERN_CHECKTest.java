package CYCPATTERN_CHECK;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CYCPATTERN_CHECKTest {

    @Test
    public void testCycPatternCheckStandardCase() {
        assertTrue(CYCPATTERN_CHECK.cycpattern_check("abcd", "abd"));
    }

    @Test
    public void testCycPatternCheckEqualCase() {
        assertTrue(CYCPATTERN_CHECK.cycpattern_check("hello", "ell"));
    }

    @Test
    public void testCycPatternCheckLessCase() {
        assertFalse(CYCPATTERN_CHECK.cycpattern_check("abab", "baa"));
    }
}