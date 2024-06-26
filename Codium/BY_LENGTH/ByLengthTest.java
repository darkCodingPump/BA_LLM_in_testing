package BY_LENGTH;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ByLengthTest {


    // Sorts and reverses an array of integers between 1 and 9 inclusive, replacing each digit with its corresponding name.
    @Test
    public void test_sort_and_reverse_array() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 1, 1, 4, 5, 8, 2, 3));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"));
        ArrayList<String> result = BY_LENGTH.by_length(arr);
        assertEquals(expected, result);
    }

    // Returns an empty array when given an array with no integers between 1 and 9 inclusive.
    @Test
    public void test_empty_array() {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> result = BY_LENGTH.by_length(arr);
        assertEquals(expected, result);
    }

    // Returns an empty array when given an array with only integers outside the range of 1 to 9 inclusive.
/*     @Test
    public void test_empty_array() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, -1, 55));
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> result = BY_LENGTH.by_length(arr);
        assertEquals(expected, result);
    } */
}