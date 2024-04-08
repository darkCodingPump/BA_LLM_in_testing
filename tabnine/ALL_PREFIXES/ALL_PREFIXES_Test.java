package ALL_PREFIXES;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALL_PREFIXES_Test {

    @Test
    public void testAllPrefixes() {
        List<String> expected = new ArrayList<>(Arrays.asList("", "a", "ab", "abc", "abcd"));
        List<String> actual = ALL_PREFIXES.all_prefixes("abcde");
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyString() {
        List<String> expected = new ArrayList<>(Arrays.asList(""));
        List<String> actual = ALL_PREFIXES.all_prefixes("");
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleCharacterString() {
        List<String> expected = new ArrayList<>(Arrays.asList("", "a"));
        List<String> actual = ALL_PREFIXES.all_prefixes("a");
        assertEquals(expected, actual);
    }
}