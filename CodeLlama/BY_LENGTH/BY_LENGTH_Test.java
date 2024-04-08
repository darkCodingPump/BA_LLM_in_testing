package BY_LENGTH;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class BY_LENGTH_Test {
    @Test
    public void testByLength1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 1, 1, 4, 5, 8, 2, 3));
        ArrayList<String> expectedOutput = new ArrayList<>(Arrays.asList("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"));
        ArrayList<String> actualOutput = BY_LENGTH.by_length(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testByLength2() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<String> expectedOutput = new ArrayList<>();
        ArrayList<String> actualOutput = BY_LENGTH.by_length(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testByLength3() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, -1 , 55));
        ArrayList<String> expectedOutput = new ArrayList<>(Arrays.asList("One"));
        ArrayList<String> actualOutput = BY_LENGTH.by_length(input);
        assertEquals(expectedOutput, actualOutput);
    }
}