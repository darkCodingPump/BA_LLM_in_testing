package ALL_PREFIXES;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALL_PREFIXES_Test {
    @Test
    public void testAllPrefixes() {
        String string = "hello";
        List<String> expected = Arrays.asList("h", "he", "hel", "hell", "hello");
        assertEquals(expected, ALL_PREFIXES.all_prefixes(string));
    }

    @Test
    public void testAllPrefixesWithEmptyString() {
        String string = "";
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ALL_PREFIXES.all_prefixes(string));
    }

    @Test
    public void testAllPrefixesWithSingleCharacterString() {
        String string = "a";
        List<String> expected = Arrays.asList("a");
        assertEquals(expected, ALL_PREFIXES.all_prefixes(string));
    }
}