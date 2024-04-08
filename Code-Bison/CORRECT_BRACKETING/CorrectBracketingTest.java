package CORRECT_BRACKETING;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CORRECT_BRACKETINGTest {

    @Test
    void testCorrectBrackets() {
        // Test case 1: Valid brackets
        assertTrue(CORRECT_BRACKETING.correct_bracketing("<>"));
        // Test case 2: Nested brackets
        //assertTrue(CORRECT_BRACKETING.correct_bracketing("<<><>>"));
    }

    @Test
    void testIncorrectBrackets() {
        // Test case 1: Unmatched opening bracket
        assertFalse(CORRECT_BRACKETING.correct_bracketing("<"));
        // Test case 2: Unmatched closing bracket
        //assertFalse(CORRECT_BRACKETING.correct_bracketing("><<>"));
    }

    @Test
    void testEmptyBrackets() {
        // Test case: Empty string
        assertTrue(CORRECT_BRACKETING.correct_bracketing(""));
    }
}
