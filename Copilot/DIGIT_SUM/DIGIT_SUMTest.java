package DIGIT_SUM;

import org.junit.Test;
import static org.junit.Assert.*;

public class DIGIT_SUMTest {

    // Normal case: input string is "abAB"
    // The sum of the ASCII codes of the upper characters 'A' and 'B' is 65 + 66 = 131
    @Test
    public void test_normal_case() {
        String input = "abAB";
        int expected = 131;
        int result = DIGIT_SUM.digit_sum(input);
        assertEquals(expected, result);
    }

    // Edge case: input string is empty
    // The sum of the ASCII codes of the upper characters is 0
    @Test
    public void test_empty_string() {
        String input = "";
        int expected = 0;
        int result = DIGIT_SUM.digit_sum(input);
        assertEquals(expected, result);
    }

    // Edge case: input string contains only lower characters
    // There are no upper characters, so the sum of the ASCII codes is 0
    @Test
    public void test_no_upper_characters() {
        String input = "abcde";
        int expected = 0;
        int result = DIGIT_SUM.digit_sum(input);
        assertEquals(expected, result);
    }
}