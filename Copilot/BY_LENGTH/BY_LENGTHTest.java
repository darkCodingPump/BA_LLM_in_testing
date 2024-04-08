package BY_LENGTH;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;


public class BY_LENGTHTest {

    // Normal test case
    @Test
    public void test_by_length_normal() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 1, 5, 2, 4));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Five", "Four", "Three", "Two", "One"));
        ArrayList<String> result = BY_LENGTH.by_length(input);
        assertEquals(expected, result);
    }

    // Edge case: Empty input list
    @Test
    public void test_by_length_empty_list() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> result = BY_LENGTH.by_length(input);
        assertEquals(expected, result);
    }

    // Edge case: Input list with duplicate numbers
    @Test
    public void test_by_length_duplicate_numbers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 2, 1, 1, 3, 3));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Three", "Three", "Two", "Two", "One", "One"));
        ArrayList<String> result = BY_LENGTH.by_length(input);
        assertEquals(expected, result);
    }
}