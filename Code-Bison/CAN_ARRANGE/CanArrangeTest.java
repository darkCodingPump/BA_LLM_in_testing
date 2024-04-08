package CAN_ARRANGE;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CanArrangeTest {

    @Test
    public void normalTestCase() {
        int[] arr = {1, 2, 4, 3, 5};
        assertEquals(3, CAN_ARRANGE.can_arrange(arr));
    }

    @Test
    public void edgeCaseAllIncreasing() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, CAN_ARRANGE.can_arrange(arr));
    }

    @Test
    public void edgeCaseAllDecreasing() {
        int[] arr = {5, 4, 3, 2, 1};
        assertEquals(0, CAN_ARRANGE.can_arrange(arr));
    }
}