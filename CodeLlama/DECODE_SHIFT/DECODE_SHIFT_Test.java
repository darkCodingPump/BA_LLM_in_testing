package DECODE_SHIFT;

import org.junit.Test;
import static org.junit.Assert.*;

public class DECODE_SHIFT_Test{
    @Test
    public void testEncodeShiftNormal() {
        String input = "hello";
        String expected = "mjqqt";
        String actual = DECODE_SHIFT.encode_shift(input);
        assertEquals(expected, actual);
    }
    @Test
public void testEncodeShiftEdge() {
    String input = "world";
    String expected = "bhvwn";
    String actual = DECODE_SHIFT.encode_shift(input);
    assertEquals(expected, actual);
}
@Test
public void testDecodeShiftEdge() {
    String input = "mjqqt";
    String expected = "hello";
    String actual = DECODE_SHIFT.decode_shift(input);
    assertEquals(expected, actual);
}
}