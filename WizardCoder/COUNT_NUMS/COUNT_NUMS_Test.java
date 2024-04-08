package COUNT_NUMS;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class COUNT_NUMS_Test {

    @Test
    public void testStandardCase() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(123, -456, 789));
        assertEquals(3, COUNT_NUMS.count_nums(arr));
    }

    @Test
    public void testEdgeCase1() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 0, 0));
        assertEquals(0, COUNT_NUMS.count_nums(arr));
    }

    @Test
    public void testEdgeCase2() {
        ArrayList<Integer> arr = new ArrayList<>();
        assertEquals(0, COUNT_NUMS.count_nums(arr));
    }
}