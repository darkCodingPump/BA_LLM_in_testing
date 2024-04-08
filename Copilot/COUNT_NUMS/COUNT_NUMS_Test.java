package COUNT_NUMS;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class COUNT_NUMS_Test {

    // Normal test case
    @Test
    public void test_count_nums_normal() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(123);
        arr.add(-456);
        arr.add(789);
        int result = COUNT_NUMS.count_nums(arr);
        assertEquals(3, result);
    }

    // Edge case: Empty list
    @Test
    public void test_count_nums_empty_list() {
        ArrayList<Integer> arr = new ArrayList<>();
        int result = COUNT_NUMS.count_nums(arr);
        assertEquals(0, result);
    }

    // Edge case: List with negative numbers only
     @Test
    public void test_count_nums_negative_numbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-123);
        arr.add(-456);
        arr.add(-789);
        int result = COUNT_NUMS.count_nums(arr);
        assertEquals(0, result);
    }
} 