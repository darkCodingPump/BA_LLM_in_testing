package FILTER_BY_PREFIX;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FILTER_BY_PREFIXTest {

    // Normal test case
    @Test
    public void test_filter_by_prefix_normal_case() {
        List<String> strings = new ArrayList<String>(Arrays.asList("apple", "banana", "orange", "avocado"));
        String prefix = "a";
        List<String> expected = new ArrayList<String>(Arrays.asList("apple", "avocado"));
        List<String> result = FILTER_BY_PREFIX.filter_by_prefix(strings, prefix);
        assertEquals(expected, result);
    }

    // Edge case: empty list of strings
    @Test
    public void test_filter_by_prefix_empty_list() {
        List<String> strings = new ArrayList<String>();
        String prefix = "a";
        List<String> expected = new ArrayList<String>();
        List<String> result = FILTER_BY_PREFIX.filter_by_prefix(strings, prefix);
        assertEquals(expected, result);
    }

    // Edge case: no strings with the given prefix
    @Test
    public void test_filter_by_prefix_no_matching_strings() {
        List<String> strings = new ArrayList<String>(Arrays.asList("apple", "banana", "orange", "avocado"));
        String prefix = "z";
        List<String> expected = new ArrayList<String>();
        List<String> result = FILTER_BY_PREFIX.filter_by_prefix(strings, prefix);
        assertEquals(expected, result);
    }
}