package COUNT_DISTINCT_CHARACTERS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class COUNT_DISTINCT_CHARACTERSTest {

    @Test
    public void testStandardCase() {
        assertEquals(5, COUNT_DISTINCT_CHARACTERS.count_distinct_characters("Hello, World!"));
    }

    @Test
    public void testEdgeCase1() {
        assertEquals(1, COUNT_DISTINCT_CHARACTERS.count_distinct_characters("a"));
    }

    @Test
    public void testEdgeCase2() {
        assertEquals(0, COUNT_DISTINCT_CHARACTERS.count_distinct_characters(""));
    }
}