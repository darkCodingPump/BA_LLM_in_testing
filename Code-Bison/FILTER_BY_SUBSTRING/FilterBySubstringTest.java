package FILTER_BY_SUBSTRING;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FILTER_BY_SUBSTRINGTest {

    @Test
    void normalCase() {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "dog", "elephant");
        String substring = "an";
        List<String> expectedResult = Arrays.asList("apple", "banana");

        assertEquals(expectedResult, FILTER_BY_SUBSTRING.filter_by_substring(strings, substring));
    }

    @Test
    void emptySubstring() {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "dog", "elephant");
        String substring = "";
        List<String> expectedResult = Arrays.asList("apple", "banana", "cherry", "dog", "elephant");

        assertEquals(expectedResult, FILTER_BY_SUBSTRING.filter_by_substring(strings, substring));
    }

    @Test
    void substringNotFound() {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "dog", "elephant");
        String substring = "zebra";
        List<String> expectedResult = new ArrayList<>();

        assertEquals(expectedResult, FILTER_BY_SUBSTRING.filter_by_substring(strings, substring));
    }
}