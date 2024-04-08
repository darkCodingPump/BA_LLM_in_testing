package COUNT_DISTINCT_CHARACTERS;

import org.junit.Test;
import static org.junit.Assert.*;

public class COUNT_DISTINCT_CHARACTERSTest {
    @Test
    public void testCountDistinctCharacters() {
        String string = "Hello World";
        int expected = 5;
        int actual = COUNT_DISTINCT_CHARACTERS.count_distinct_characters(string);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountDistinctCharactersWithEmptyString() {
        String string = "";
        int expected = 0;
        int actual = COUNT_DISTINCT_CHARACTERS.count_distinct_characters(string);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountDistinctCharactersWithNullString() {
        String string = null;
        int expected = 0;
        int actual = COUNT_DISTINCT_CHARACTERS.count_distinct_characters(string);
        assertEquals(expected, actual);
    }
}