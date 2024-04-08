package DIGIT_SUM;

import org.junit.Test;
import static org.junit.Assert.*;

public class DIGIT_SUM_Test {
    @Test
    public void testDigitSumNormal() {
        String input = "abAB";
        int expected = 131;
        int actual = DIGIT_SUM.digit_sum(input);
        assertEquals(expected, actual);
    }
        @Test
public void testDigitSumEdge() {
    String input = "abcCd";
    int expected = 67;
    int actual = DIGIT_SUM.digit_sum(input);
    assertEquals(expected, actual);
}
    @Test
public void testDigitSumEdge2() {
    String input = "woArBld";
    int expected = 131;
    int actual = DIGIT_SUM.digit_sum(input);
    assertEquals(expected, actual);
}
}