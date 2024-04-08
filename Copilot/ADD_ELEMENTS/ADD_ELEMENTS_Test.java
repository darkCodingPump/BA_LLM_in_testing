package ADD_ELEMENTS;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ADD_ELEMENTS_Test {

    // Normal test case
    @Test
    public void test_add_elements_normal() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(111);
        arr.add(21);
        arr.add(3);
        arr.add(4000);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        int k = 4;
        int result = ADD_ELEMENTS.add_elements(arr, k);
        assertEquals(24, result);
    }

    // Edge case: Empty array
     @Test
    public void test_add_elements_empty_array() {
        ArrayList<Integer> arr = new ArrayList<>();
        int k = 3;
        int result = ADD_ELEMENTS.add_elements(arr, k);
        assertEquals(0, result);
    }

    // Edge case: k is greater than the array size
    @Test
    public void test_add_elements_k_greater_than_array_size() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(111);
        arr.add(21);
        arr.add(3);
        int k = 5;
        int result = ADD_ELEMENTS.add_elements(arr, k);
        assertEquals(135, result);
    } 
}