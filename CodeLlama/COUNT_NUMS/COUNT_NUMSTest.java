package COUNT_NUMS;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class COUNT_NUMSTest {
    @Test
    public void testCountNumsNormalCase() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int expected = 5;
        int actual = COUNT_NUMS.count_nums(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNumsEdgeCase1() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        int expected = 0;
        int actual = COUNT_NUMS.count_nums(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNumsEdgeCase2() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5));
        int expected = 0;
        int actual = COUNT_NUMS.count_nums(arr);
        assertEquals(expected, actual);
    }
}