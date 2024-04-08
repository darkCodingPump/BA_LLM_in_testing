package DIGITS;

import org.junit.Test;
import static org.junit.Assert.*;

public class DIGITSTest {

    // Normal case: Testing with a positive integer that contains odd and even digits.
    @Test
    public void test_digits_normalCase() {
        int n = 235;
        int expected = 15;
        int result = DIGITS.digits(n);
        assertEquals(expected, result);
    }

    // Edge case: Testing with a positive integer that contains only even digits.
    @Test
    public void test_digits_allEvenDigits() {
        int n = 468;
        int expected = 0;
        int result = DIGITS.digits(n);
        assertEquals(expected, result);
    }

    // Edge case: Testing with a positive integer that contains only one odd digit.
    @Test
    public void test_digits_singleOddDigit() {
        int n = 7;
        int expected = 7;
        int result = DIGITS.digits(n);
        assertEquals(expected, result);
    }
}