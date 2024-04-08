package FILTER_BY_SUBSTRING;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class FILTER_BY_SUBSTRINGTest {

    @Test
    public void testFilterBySubstring() {
        List<String> strings = new ArrayList<String>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Test");
        String substring = "o";
        List<String> expected = new ArrayList<String>();
        expected.add("Hello");
        expected.add("World");
        List<String> actual = FILTER_BY_SUBSTRING.filter_by_substring(strings, substring);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterBySubstringWithEmptySubstring() {
        List<String> strings = new ArrayList<String>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Test");
        String substring = "";
        List<String> expected = new ArrayList<String>();
        expected.add("Hello");
        expected.add("World");
        expected.add("Test");
        List<String> actual = FILTER_BY_SUBSTRING.filter_by_substring(strings, substring);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterBySubstringWithEmptyList() {
        List<String> strings = new ArrayList<String>();
        String substring = "o";
        List<String> expected = new ArrayList<String>();
        List<String> actual = FILTER_BY_SUBSTRING.filter_by_substring(strings, substring);
        assertEquals(expected, actual);
    }
}