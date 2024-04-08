package ADD_ELEMENTS;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ADD_ELEMENTS_Test {

    @Test
    public void testStandardCase() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(111, 21, 3, 4000, 5, 6, 7, 8, 9));
        int k = 4;
        int expectedResult = 24;
        assertEquals(expectedResult, ADD_ELEMENTS.add_elements(arr, k));
    }

    @Test
    public void testEdgeCase1() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(111, 21, 3, 4000, 5, 6, 7, 8, 9));
        int k = 1;
        int expectedResult = 0;
        assertEquals(expectedResult, ADD_ELEMENTS.add_elements(arr, k));
    }

    @Test
    public void testEdgeCase2() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(111, 21, 3, 4000, 5, 6, 7, 8, 9));
        int k = arr.size();
        int expectedResult = 111 + 21;
        assertEquals(expectedResult, ADD_ELEMENTS.add_elements(arr, k));
    }
}