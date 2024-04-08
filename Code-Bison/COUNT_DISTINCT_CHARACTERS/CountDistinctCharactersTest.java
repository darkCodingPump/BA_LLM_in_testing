package COUNT_DISTINCT_CHARACTERS;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class COUNT_DISTINCT_CHARACTERS_Test {

    @Test
    void normal_case() {
        // Test case 1: Normal case, mixed case.
        String string1 = "Programming";
        int expected1 = 9;
        int actual1 = COUNT_DISTINCT_CHARACTERS.count_distinct_characters(string1);
        assertEquals(expected1, actual1);
    }

    @Test
    void empty_string() {
        // Test case 2: Edge case, empty string.
        String string2 = "";
        int expected2 = 0;
        int actual2 = COUNT_DISTINCT_CHARACTERS.count_distinct_characters(string2);
        assertEquals(expected2, actual2);
    }

    @Test
    void one_repeated_character() {
        // Test case 3: Edge case, string with only one repeated character.
        String string3 = "AAAAAAAA";
        int expected3 = 1;
        int actual3 = COUNT_DISTINCT_CHARACTERS.count_distinct_characters(string3);
        assertEquals(expected3, actual3);
    }
}