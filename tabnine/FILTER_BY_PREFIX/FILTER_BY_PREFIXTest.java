package FILTER_BY_PREFIX;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class FILTER_BY_PREFIXTest {

    @Test
    public void testFilterByPrefixNormal() {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Durian");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Apple");
        expectedResult.add("Banana");

        List<String> actualResult = FILTER_BY_PREFIX.filter_by_prefix(strings, "A");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFilterByPrefixEmptyPrefix() {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Durian");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Apple");
        expectedResult.add("Banana");
        expectedResult.add("Cherry");
        expectedResult.add("Durian");

        List<String> actualResult = FILTER_BY_PREFIX.filter_by_prefix(strings, "");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFilterByPrefixEmptyList() {
        List<String> strings = new ArrayList<>();

        List<String> expectedResult = new ArrayList<>();

        List<String> actualResult = FILTER_BY_PREFIX.filter_by_prefix(strings, "A");

        assertEquals(expectedResult, actualResult);
    }
}