package DIGITS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DIGITSTest {

    @Test
    @DisplayName("Normal Test")
    void normalTest() {
        assertEquals(15, DIGITS.digits(235));
    }

    @Test
    @DisplayName("Edge Case: All Even Digits")
    void allEvenDigits() {
        assertEquals(0, DIGITS.digits(4));
    }

    @Test
    @DisplayName("Edge Case: Single Digit")
    void singleDigit() {
        assertEquals(1, DIGITS.digits(1));
    }
}