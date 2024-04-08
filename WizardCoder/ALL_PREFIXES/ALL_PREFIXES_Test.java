package ALL_PREFIXES;


import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ALL_PREFIXES_Test {

    @Test
    public void testAllPrefixes() {
        String testString = "test";
        List<String> expected = Arrays.asList("t", "te", "tes", "test");
        assertEquals(expected, ALL_PREFIXES.all_prefixes(testString));
    }

    @Test
    public void testAllPrefixes_EmptyString() {
        String testString = "";
        List<String> expected = Arrays.asList();
        assertEquals(expected, ALL_PREFIXES.all_prefixes(testString));
    }

    @Test
    public void testAllPrefixes_SingleCharacter() {
        String testString = "a";
        List<String> expected = Arrays.asList("a");
        assertEquals(expected, ALL_PREFIXES.all_prefixes(testString));
    }
}