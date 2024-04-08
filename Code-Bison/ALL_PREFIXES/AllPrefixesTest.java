package ALL_PREFIXES;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class AllPrefixesTest {

    @Test
    public void normalCase() {
        String input = "ABCD";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("A");
        expectedOutput.add("AB");
        expectedOutput.add("ABC");
        expectedOutput.add("ABCD");
        assertEquals(expectedOutput, ALL_PREFIXES.all_prefixes(input));
    }

    @Test
    public void emptyString() {
        String input = "";
        List<String> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, ALL_PREFIXES.all_prefixes(input));
    }

    @Test
    public void singleCharacter() {
        String input = "Z";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Z");
        assertEquals(expectedOutput, ALL_PREFIXES.all_prefixes(input));
    }
}