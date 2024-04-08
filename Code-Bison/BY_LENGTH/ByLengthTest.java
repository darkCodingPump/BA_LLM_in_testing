package BY_LENGTH;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BY_LENGTHTest {

    @Test
    void normalCase() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 1, 1, 4, 5, 8, 2, 3));
        ArrayList<String> expectedOutput = new ArrayList<>(Arrays.asList("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"));
        assertEquals(expectedOutput, BY_LENGTH.by_length(input));
    }

    @Test
    void edgeCaseEmptyArray() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<String> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, BY_LENGTH.by_length(input));
    }

    @Test
    void edgeCaseStrangeNumbers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, -1, 55));
        ArrayList<String> expectedOutput = new ArrayList<>(Arrays.asList("One"));
        assertEquals(expectedOutput, BY_LENGTH.by_length(input));
    }
}