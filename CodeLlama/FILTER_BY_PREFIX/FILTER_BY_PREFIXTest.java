package FILTER_BY_PREFIX;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class FILTER_BY_PREFIXTest {

    @Test
    public void testFilterByPrefix() {
        List<String> strings = new ArrayList<String>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Test");
        String prefix = "H";
        List<String> expected = new ArrayList<String>();
        expected.add("Hello");
        List<String> actual = FILTER_BY_PREFIX.filter_by_prefix(strings, prefix);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterByPrefixWithEmptyPrefix() {
        List<String> strings = new ArrayList<String>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Test");
        String prefix = "";
        List<String> expected = new ArrayList<String>();
        expected.add("Hello");
        expected.add("World");
        expected.add("Test");
        List<String> actual = FILTER_BY_PREFIX.filter_by_prefix(strings, prefix);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterByPrefixWithEmptyList() {
        List<String> strings = new ArrayList<String>();
        String prefix = "H";
        List<String> expected = new ArrayList<String>();
        List<String> actual = FILTER_BY_PREFIX.filter_by_prefix(strings, prefix);
        assertEquals(expected, actual);
    }
}