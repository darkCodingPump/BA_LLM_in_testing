package FILTER_BY_SUBSTRING;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FILTER_BY_SUBSTRINGTest {

    // Normal test case
    @Test
    public void test_filter_by_substring_normal_case() {
        List<String> strings = new ArrayList<String>(Arrays.asList("apple", "banana", "orange", "avocado"));
        String substring = "an";
        List<String> expected = new ArrayList<String>(Arrays.asList("banana", "orange"));
        List<String> result = FILTER_BY_SUBSTRING.filter_by_substring(strings, substring);
        assertEquals(expected, result);
    }

    // Edge case: empty list of strings
    @Test
    public void test_filter_by_substring_empty_list() {
        List<String> strings = new ArrayList<String>();
        String substring = "an";
        List<String> expected = new ArrayList<String>();
        List<String> result = FILTER_BY_SUBSTRING.filter_by_substring(strings, substring);
        assertEquals(expected, result);
    }

    // Edge case: no strings with the given substring
    @Test
    public void test_filter_by_substring_no_matching_strings() {
        List<String> strings = new ArrayList<String>(Arrays.asList("apple", "banana", "orange", "avocado"));
        String substring = "xyz";
        List<String> expected = new ArrayList<String>();
        List<String> result = FILTER_BY_SUBSTRING.filter_by_substring(strings, substring);
        assertEquals(expected, result);
    }
}