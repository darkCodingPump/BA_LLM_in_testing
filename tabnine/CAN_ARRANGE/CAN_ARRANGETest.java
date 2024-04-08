package CAN_ARRANGE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CAN_ARRANGETest {

    @Test
    public void testStandardCase() {
        int expectedResult = 3;
        int[] arr = {1, 2, 4, 3, 5};
        int result = CAN_ARRANGE.can_arrange(arr);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testAscendingOrderCase() {
        int expectedResult = -1;
        int[] arr = {1, 2, 3};
        int result = CAN_ARRANGE.can_arrange(arr);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testDescendingOrderCase() {
        int expectedResult = 0;
        int[] arr = {5, 4, 3, 2, 1};
        int result = CAN_ARRANGE.can_arrange(arr);
        assertEquals(expectedResult, result);
    }
}