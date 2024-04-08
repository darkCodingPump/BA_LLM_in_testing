package FILTER_BY_PREFIX;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FILTER_BY_PREFIXTest {

    @Test
    public void testFilterByPrefix() {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        String prefix = "b";
        List<String> expected = Arrays.asList("banana");
        List<String> actual = FILTER_BY_PREFIX.filter_by_prefix(strings, prefix);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterByPrefixWithEmptyList() {
        List<String> strings = Arrays.asList();
        String prefix = "b";
        List<String> expected = Arrays.asList();
        List<String> actual = FILTER_BY_PREFIX.filter_by_prefix(strings, prefix);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterByPrefixWithEmptyPrefix() {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        String prefix = "";
        List<String> expected = strings;
        List<String> actual = FILTER_BY_PREFIX.filter_by_prefix(strings, prefix);
        assertEquals(expected, actual);
    }
}