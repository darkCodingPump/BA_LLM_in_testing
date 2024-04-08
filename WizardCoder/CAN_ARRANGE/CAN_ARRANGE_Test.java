package CAN_ARRANGE;

import org.junit.Test;
import static org.junit.Assert.*;

public class CAN_ARRANGE_Test {

    @Test
    public void testStandardCase() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(CAN_ARRANGE.can_arrange(arr), -1);
    }

    @Test
    public void testEdgeCase1() {
        int[] arr = {5, 4, 3, 2, 1};
        assertEquals(CAN_ARRANGE.can_arrange(arr), 1);
    }

    @Test
    public void testEdgeCase2() {
        int[] arr = {1, 1, 1, 1, 1};
        assertEquals(CAN_ARRANGE.can_arrange(arr), -1);
    }
}