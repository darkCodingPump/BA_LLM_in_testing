package FILTER_BY_SUBSTRING;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FILTER_BY_SUBSTRINGTest {

    @Test
    public void testFilterBySubstring() {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Programming");
        String substring = "o";
        List<String> expected = Arrays.asList("Hello", "World", "Programming");
        List<String> actual = FILTER_BY_SUBSTRING.filter_by_substring(strings, substring);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterBySubstringWithEmptyList() {
        List<String> strings = Arrays.asList();
        String substring = "o";
        List<String> expected = Arrays.asList();
        List<String> actual = FILTER_BY_SUBSTRING.filter_by_substring(strings, substring);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterBySubstringWithEmptySubstring() {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Programming");
        String substring = "";
        List<String> expected = Arrays.asList("Hello", "World", "Java", "Programming");
        List<String> actual = FILTER_BY_SUBSTRING.filter_by_substring(strings, substring);
        assertEquals(expected, actual);
    }
}