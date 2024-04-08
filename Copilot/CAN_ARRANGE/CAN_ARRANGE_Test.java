package CAN_ARRANGE;

import org.junit.Test;
import static org.junit.Assert.*;

public class CAN_ARRANGE_Test {

    // Normal test case
    @Test
    public void test_can_arrange_normal() {
        int[] arr = {1, 2, 4, 3, 5};
        int result = CAN_ARRANGE.can_arrange(arr);
        assertEquals(3, result);
    }

    // Edge case: Empty array
    @Test
    public void test_can_arrange_empty_array() {
        int[] arr = {};
        int result = CAN_ARRANGE.can_arrange(arr);
        assertEquals(-1, result);
    }

    // Edge case: Array with a single element
    @Test
    public void test_can_arrange_single_element() {
        int[] arr = {5};
        int result = CAN_ARRANGE.can_arrange(arr);
        assertEquals(-1, result);
    }
}