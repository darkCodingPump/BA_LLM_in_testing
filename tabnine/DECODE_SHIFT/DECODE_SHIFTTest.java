package DECODE_SHIFT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DECODE_SHIFTTest {

    @Test
    public void testEncodeShift() {
        String input = "hello";
        String expectedOutput = "lkhoz";
        String actualOutput = DECODE_SHIFT.encode_shift(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testDecodeShift() {
        String input = "lkhoz";
        String expectedOutput = "hello";
        String actualOutput = DECODE_SHIFT.decode_shift(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testEncodeShiftEdgeCase() {
        String input = "Zyx";
        String expectedOutput = "dbba";
        String actualOutput = DECODE_SHIFT.encode_shift(input);
        assertEquals(expectedOutput, actualOutput);
    }
}