package COUNT_UPPER;

import org.junit.Test;
import static org.junit.Assert.*;

public class COUNT_UPPERTest {

    // Normal test case
    @Test
    public void test_count_upper_normal() {
        String s = "aBCdEf";
        int result = COUNT_UPPER.count_upper(s);
        assertEquals(1, result);
    }

    // Edge case: Empty string
    @Test
    public void test_count_upper_empty_string() {
        String s = "";
        int result = COUNT_UPPER.count_upper(s);
        assertEquals(0, result);
    }

    // Edge case: String with no uppercase vowels in even indices
    @Test
    public void test_count_upper_no_uppercase_vowels() {
        String s = "abcdefg";
        int result = COUNT_UPPER.count_upper(s);
        assertEquals(0, result);
    }
}