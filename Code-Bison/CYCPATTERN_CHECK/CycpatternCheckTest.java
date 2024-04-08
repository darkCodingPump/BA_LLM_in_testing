package CYCPATTERN_CHECK;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CYCPATTERN_CHECKTest {
    @Test
    void normalTest() {
        assertTrue(CYCPATTERN_CHECK.cycpattern_check("abab", "baa"));
    }

    @Test
    void edgeCase1() {
        assertTrue(CYCPATTERN_CHECK.cycpattern_check("abcd", "abd"));
    }

    @Test
    void edgeCase2() {
        assertFalse(CYCPATTERN_CHECK.cycpattern_check("efef", "eeff"));
    }
}