package CYCPATTERN_CHECK;

import org.junit.Test;
import static org.junit.Assert.*;

public class CYCPATTERN_CHECK_Test {
    @Test
    public void testCycPatternCheckNormal() {
        String a = "abcd";
        String b = "abd";
        boolean expected = false;
        boolean actual = CYCPATTERN_CHECK.cycpattern_check(a, b);
        assertEquals(expected, actual);
    }
    @Test
public void testCycPatternCheckEdge() {
    String a = "hello";
    String b = "ell";
    boolean expected = true;
    boolean actual = CYCPATTERN_CHECK.cycpattern_check(a, b);
    assertEquals(expected, actual);
}
@Test
public void testCycPatternCheckEdge2() {
    String a = "abab";
    String b = "baa";
    boolean expected = true;
    boolean actual = CYCPATTERN_CHECK.cycpattern_check(a, b);
    assertEquals(expected, actual);
}
}