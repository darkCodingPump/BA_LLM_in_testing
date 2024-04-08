package CORRECT_BRACKETING;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CORRECT_BRACKETINGTest {

    @Test
    public void testStandardCase() {
        assertTrue(CORRECT_BRACKETING.correct_bracketing("<>"));
    }

    @Test
    public void testEdgeCase1() {
        assertFalse(CORRECT_BRACKETING.correct_bracketing("<>"));
    }

    @Test
    public void testEdgeCase2() {
        assertTrue(CORRECT_BRACKETING.correct_bracketing(""));
    }
}