package CAN_ARRANGE;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

public class CanArrangeTest {


    // Returns the largest index of an element which is not greater than or equal to the element immediately preceding it.
    @Test
    public void test_largest_index() {
        int[] arr = {1, 2, 4, 3, 5};
        int result = CAN_ARRANGE.can_arrange(arr);
        assertEquals(3, result);
    }

    // Works correctly for an array of size 1.
    @Test
    public void test_array_size_1() {
        int[] arr = {1};
        int result = CAN_ARRANGE.can_arrange(arr);
        assertEquals(-1, result);
    }

    // Works correctly for an array of size 10000.
/*     @Test
    public void test_largest_index() {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int result = CAN_ARRANGE.can_arrange(arr);
        assertEquals(9999, result);
    } */
}