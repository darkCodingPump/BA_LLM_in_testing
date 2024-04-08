package DECODE_SHIFT;

import org.junit.Test;
import static org.junit.Assert.*;

public class DECODE_SHIFTTest {

    // Normal test case
    @Test
    public void test_encode_shift_normal() {
        String result = DECODE_SHIFT.encode_shift("hello");
        assertEquals("mjqqt", result);
    }

    // Edge case: empty string
    @Test
    public void test_encode_shift_empty_string() {
        String result = DECODE_SHIFT.encode_shift("");
        assertEquals("", result);
    }

    // Edge case: string with all lowercase letters
    @Test
    public void test_encode_shift_all_lowercase() {
        String result = DECODE_SHIFT.encode_shift("abcdefghijklmnopqrstuvwxyz");
        assertEquals("fghijklmnopqrstuvwxyzabcde", result);
    }
}