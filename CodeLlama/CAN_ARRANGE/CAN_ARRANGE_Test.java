package CAN_ARRANGE;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CAN_ARRANGE_Test {
    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int expected = -1;
        assertEquals(expected, CAN_ARRANGE.can_arrange(arr));
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {5};
        int expected = -1;
        assertEquals(expected, CAN_ARRANGE.can_arrange(arr));
    }

    @Test
    public void testMultipleElementArray() {
        int[] arr = {1, 2, 4, 3, 5};
        int expected = 3;
        assertEquals(expected, CAN_ARRANGE.can_arrange(arr));
    }
}