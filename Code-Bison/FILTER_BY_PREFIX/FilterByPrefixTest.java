package FILTER_BY_PREFIX;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class FilterByPrefixTest {

    @Test
    void normalTest() {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("dog");
        strings.add("elephant");

        List<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("banana");
        expected.add("cherry");

        assertEquals(expected, FILTER_BY_PREFIX.filter_by_prefix(strings, "a"));
    }

    @Test
    void emptyPrefixTest() {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("dog");
        strings.add("elephant");

        List<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("banana");
        expected.add("cherry");
        expected.add("dog");
        expected.add("elephant");

        assertEquals(expected, FILTER_BY_PREFIX.filter_by_prefix(strings, ""));
    }

    @Test
    void noMatchingPrefixTest() {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("dog");
        strings.add("elephant");

        List<String> expected = new ArrayList<>();

        assertEquals(expected, FILTER_BY_PREFIX.filter_by_prefix(strings, "z"));
    }
}