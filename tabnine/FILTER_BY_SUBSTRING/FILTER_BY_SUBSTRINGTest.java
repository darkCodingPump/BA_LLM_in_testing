package FILTER_BY_SUBSTRING;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class FILTER_BY_SUBSTRINGTest {

    @Test
    public void testFilterBySubstring_StandardCase() {
        List<String> strings = Arrays.asList("Saturn", "Uranus", "Venus", "Earth", "Mercury", "Mars", "Jupiter");
        String substring = "Ur";
        List<String> expectedResult = Arrays.asList("Uranus", "Earth");
        assertEquals(expectedResult, FILTER_BY_SUBSTRING.filter_by_substring(strings, substring));
    }

    @Test
    public void testFilterBySubstring_EmptyStringCase() {
        List<String> strings = Arrays.asList("Saturn", "Uranus", "Venus", "Earth", "Mercury", "Mars", "Jupiter");
        String substring = "";
        List<String> expectedResult = Arrays.asList("Saturn", "Uranus", "Venus", "Earth", "Mercury", "Mars", "Jupiter");
        assertEquals(expectedResult, FILTER_BY_SUBSTRING.filter_by_substring(strings, substring));
    }

    @Test
    public void testFilterBySubstring_NullStringCase() {
        List<String> strings = Arrays.asList("Saturn", "Uranus", "Venus", "Earth", "Mercury", "Mars", "Jupiter");
        String substring = null;
        List<String> expectedResult = Arrays.asList("Saturn", "Uranus", "Venus", "Earth", "Mercury", "Mars", "Jupiter");
        assertEquals(expectedResult, FILTER_BY_SUBSTRING.filter_by_substring(strings, substring));
    }
}