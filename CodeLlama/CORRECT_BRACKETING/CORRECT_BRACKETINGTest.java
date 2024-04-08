package CORRECT_BRACKETING;

import org.junit.Test;
import static org.junit.Assert.*;

public class CORRECT_BRACKETINGTest {

    // Normal case: Test with balanced brackets
    @Test
    public void test_correct_bracketing_balanced() {
        String brackets = "<>";
        boolean result = CORRECT_BRACKETING.correct_bracketing(brackets);
        assertTrue(result);
    }

    // Edge case: Test with empty string
    @Test
    public void test_correct_bracketing_empty() {
        String brackets = "";
        boolean result = CORRECT_BRACKETING.correct_bracketing(brackets);
        assertTrue(result);
    }

    // Edge case: Test with unbalanced brackets
    @Test
    public void test_correct_bracketing_unbalanced() {
        String brackets = "><";
        boolean result = CORRECT_BRACKETING.correct_bracketing(brackets);
        assertFalse(result);
    }
}