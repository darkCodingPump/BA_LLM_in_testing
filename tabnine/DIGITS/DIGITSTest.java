package DIGITS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DIGITSTest {

    @Test
    public void testDigitsStandardCase() {
        int expectedResult = 15;
        int actualResult = DIGITS.digits(235);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDigitsAllEvenCase() {
        int expectedResult = 0;
        int actualResult = DIGITS.digits(456);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDigitsOneOddDigitCase() {
        int expectedResult = 1;
        int actualResult = DIGITS.digits(1234);
        assertEquals(expectedResult, actualResult);
    }
}