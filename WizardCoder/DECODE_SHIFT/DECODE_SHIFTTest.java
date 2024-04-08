package DECODE_SHIFT;

import org.junit.Test;
import static org.junit.Assert.*;

public class DECODE_SHIFTTest {

    @Test
    public void testEncodeShift() {
        String input = "abc";
        String expected = "fgh";
        String actual = DECODE_SHIFT.encode_shift(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testEncodeShiftEdgeCase1() {
        String input = "";
        String expected = "";
        String actual = DECODE_SHIFT.encode_shift(input);
        assertEquals(expected, actual);
    }
/* 
    @Test
    public void testEncodeShiftEdgeCase2() {
        String input = "xyz";
        String expected = "cde";
        String actual = DECODE_SHIFT.encode_shift(input);
        assertEquals(expected, actual);
    } */

    @Test
    public void testDecodeShift() {
        String input = "fgh";
        String expected = "abc";
        String actual = DECODE_SHIFT.decode_shift(input);
        assertEquals(expected, actual);
    }

/*     @Test
    public void testDecodeShiftEdgeCase1() {
        String input = "";
        String expected = "";
        String actual = DECODE_SHIFT.decode_shift(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecodeShiftEdgeCase2() {
        String input = "cde";
        String expected = "xyz";
        String actual = DECODE_SHIFT.decode_shift(input);
        assertEquals(expected, actual);
    } */
}