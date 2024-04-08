package CYCPATTERN_CHECK;

import org.junit.Test;
import static org.junit.Assert.*;

public class CYCPATTERN_CHECKTest {

    // Normal case: The second word is a substring of the first word.
    @Test
    public void test_cycpattern_check_normal() {
        boolean result = CYCPATTERN_CHECK.cycpattern_check("hello", "ell");
        assertTrue(result);
    }

    // Edge case: The second word is not a substring of the first word.
    @Test
    public void test_cycpattern_check_edge1() {
        boolean result = CYCPATTERN_CHECK.cycpattern_check("abcd", "abd");
        assertFalse(result);
    }

    // Edge case: The second word is a rotation of the first word.
    @Test
    public void test_cycpattern_check_edge2() {
        boolean result = CYCPATTERN_CHECK.cycpattern_check("abab", "baa");
        assertTrue(result);
    }
}