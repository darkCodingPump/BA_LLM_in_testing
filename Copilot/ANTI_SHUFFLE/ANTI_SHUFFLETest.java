package ANTI_SHUFFLE;

import org.junit.Test;
import static org.junit.Assert.*;

public class ANTI_SHUFFLETest {

    // Normal test case
    @Test
    public void test_normal_case() {
        String input = "Hello World!!!";
        String expectedOutput = "Hello !!!Wdlor";
        String result = ANTI_SHUFFLE.anti_shuffle(input);
        assertEquals(expectedOutput, result);
    }

    // Edge case: Empty string
    @Test
    public void test_empty_string() {
        String input = "";
        String expectedOutput = "";
        String result = ANTI_SHUFFLE.anti_shuffle(input);
        assertEquals(expectedOutput, result);
    }

    // Edge case: String with only one word
    @Test
    public void test_single_word() {
        String input = "Hi";
        String expectedOutput = "Hi";
        String result = ANTI_SHUFFLE.anti_shuffle(input);
        assertEquals(expectedOutput, result);
    }
}