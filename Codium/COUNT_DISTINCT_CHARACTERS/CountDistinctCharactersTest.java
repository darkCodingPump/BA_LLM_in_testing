package COUNT_DISTINCT_CHARACTERS;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

public class CountDistinctCharactersTest {


    // Should return 0 when given an empty string
    @Test
    public void test_empty_string() {
        int result = COUNT_DISTINCT_CHARACTERS.count_distinct_characters("");
        assertEquals(0, result);
    }

    // Should handle null input and throw an exception
    @Test
    public void test_null_input() {
        assertThrows(NullPointerException.class, () -> {
            COUNT_DISTINCT_CHARACTERS.count_distinct_characters(null);
        });
    }

    // Should handle strings with only whitespace characters
    @Test
    public void test_handle_whitespace_characters() {
        int result = COUNT_DISTINCT_CHARACTERS.count_distinct_characters("   ");
        assertEquals(0, result);
    }
}