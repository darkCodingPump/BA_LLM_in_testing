package DECODE_SHIFT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecodeShiftTest {
    @Test
    public void encodeShiftTest() {
        // Normal case:
        String originalText = "hello";
        String encodedText = DECODE_SHIFT.encode_shift(originalText);
        assertEquals("mjqqt", encodedText);
    }

    // Edge case 1: Handle an empty string
    @Test
    public void emptyString() {
        String originalText = "";
        String encodedText = DECODE_SHIFT.encode_shift(originalText);
        assertEquals("", encodedText);
    }

    // Edge case 2: Handle special characters
    @Test
    public void specialCharacters() {
        String originalText = "!@#$%^&*()";
        String encodedText = DECODE_SHIFT.encode_shift(originalText);
        assertEquals("!@#$%^&*()", encodedText);
    }
}