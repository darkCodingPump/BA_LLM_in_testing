package COUNT_DISTINCT_CHARACTERS;


import org.junit.Test;
import static org.junit.Assert.*;

public class COUNT_DISTINCT_CHARACTERS_Test {

    @Test
    public void testStandardCase() {
        assertEquals(3, COUNT_DISTINCT_CHARACTERS.count_distinct_characters("abc"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, COUNT_DISTINCT_CHARACTERS.count_distinct_characters(""));
    }

    @Test
    public void testSameCharacter() {
        assertEquals(1, COUNT_DISTINCT_CHARACTERS.count_distinct_characters("aaaaa"));
    }
}