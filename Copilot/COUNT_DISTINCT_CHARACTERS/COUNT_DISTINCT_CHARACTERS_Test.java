package COUNT_DISTINCT_CHARACTERS;

import org.junit.Test;
import static org.junit.Assert.*;

public class COUNT_DISTINCT_CHARACTERS_Test {

    // Test case for a normal input string
    @Test
    public void test_count_distinct_characters_normal() {
        String input = "Hello World";
        int expected = 8;
        int result = COUNT_DISTINCT_CHARACTERS.count_distinct_characters(input);
        assertEquals(expected, result);
    }

    // Test case for an empty input string
    @Test
    public void test_count_distinct_characters_empty() {
        String input = "";
        int expected = 0;
        int result = COUNT_DISTINCT_CHARACTERS.count_distinct_characters(input);
        assertEquals(expected, result);
    }

    // Test case for an input string with all the same characters
    @Test
    public void test_count_distinct_characters_same_characters() {
        String input = "aaaaaa";
        int expected = 1;
        int result = COUNT_DISTINCT_CHARACTERS.count_distinct_characters(input);
        assertEquals(expected, result);
    }
}