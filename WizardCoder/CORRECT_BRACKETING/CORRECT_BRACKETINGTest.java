package CORRECT_BRACKETING;

import org.junit.Test;
import static org.junit.Assert.*;

public class CORRECT_BRACKETINGTest {

    @Test
    public void testCorrectBracketing() {
        assertTrue(CORRECT_BRACKETING.correct_bracketing("<<<<>>"));
    }

    @Test
    public void testCorrectBracketingEdgeCase1() {
        assertFalse(CORRECT_BRACKETING.correct_bracketing("<<<"));
    }

    @Test
    public void testCorrectBracketingEdgeCase2() {
        assertFalse(CORRECT_BRACKETING.correct_bracketing(">>>"));
    }
}