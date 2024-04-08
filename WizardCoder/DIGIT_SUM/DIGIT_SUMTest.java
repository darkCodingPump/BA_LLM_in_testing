package DIGIT_SUM;

import org.junit.Test;
import static org.junit.Assert.*;

public class DIGIT_SUMTest {

    @Test
    public void testDigitSum() {
        assertEquals(201, DIGIT_SUM.digit_sum("ABC"));
    }

    @Test
    public void testDigitSumWithEmptyString() {
        assertEquals(0, DIGIT_SUM.digit_sum(""));
    }

    @Test
    public void testDigitSumWithNonAlphabeticCharacters() {
        assertEquals(0, DIGIT_SUM.digit_sum("123"));
    }
}