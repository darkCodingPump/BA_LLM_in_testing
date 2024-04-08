package BY_LENGTH;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class BY_LENGTHTest {

    @Test
    public void testByLengthStandardCase() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 1, 9, 3, 2));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Nine", "Five", "Three", "Two", "One"));
        assertEquals(expected, BY_LENGTH.by_length(input));
    }

    @Test
    public void testByLengthEdgeCase1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10, 11, 12));
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, BY_LENGTH.by_length(input));
    }

    @Test
    public void testByLengthEdgeCase2() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, BY_LENGTH.by_length(input));
    }
}