package ALL_PREFIXES;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class ALL_PREFIXES_Test {

    // Test with a normal string
    @Test
    public void test_normal_string() {
        String string = "hello";
        List<String> result = ALL_PREFIXES.all_prefixes(string);
        assertEquals(5, result.size());
        assertEquals("h", result.get(0));
        assertEquals("he", result.get(1));
        assertEquals("hel", result.get(2));
        assertEquals("hell", result.get(3));
        assertEquals("hello", result.get(4));
    }

    // Test with an empty string
    @Test
    public void test_empty_string() {
        String string = "";
        List<String> result = ALL_PREFIXES.all_prefixes(string);
        assertTrue(result.isEmpty());
    }

    // Test with a single character string
    @Test
    public void test_single_character_string() {
        String string = "a";
        List<String> result = ALL_PREFIXES.all_prefixes(string);
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }
}