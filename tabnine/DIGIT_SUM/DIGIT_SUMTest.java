package DIGIT_SUM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DIGIT_SUMTest {

    @Test
    public void testDigitSumEmptyString() {
        assertEquals(0, DIGIT_SUM.digit_sum(""));
    }

    @Test
    public void testDigitSumLowerCaseLetters() {
        assertEquals(0, DIGIT_SUM.digit_sum("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testDigitSumUpperCaseLetters() {
        assertEquals(205, DIGIT_SUM.digit_sum("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
}