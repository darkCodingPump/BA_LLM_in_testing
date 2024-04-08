package COUNT_NUMS;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class COUNT_NUMSTest {

    @Test
    public void testCountNumsStandardCase() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(-123);
        input.add(456);
        input.add(-789);
        assertEquals(2, COUNT_NUMS.count_nums(input));
    }

    @Test
    public void testCountNumsEdgeCase1() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(0);
        input.add(0);
        input.add(0);
        assertEquals(0, COUNT_NUMS.count_nums(input));
    }

    @Test
    public void testCountNumsEdgeCase2() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(-1);
        input.add(-2);
        input.add(-3);
        assertEquals(3, COUNT_NUMS.count_nums(input));
    }
}