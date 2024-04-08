package COUNT_NUMS;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class COUNT_NUMS_TEST {

    @Test
    void normal() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(123);
        arr.add(-456);
        arr.add(789);
        arr.add(-100);
        assertEquals(3, COUNT_NUMS.count_nums(arr));
    }

    @Test
    void zeros_only() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(0);
        arr.add(0);
        assertEquals(0, COUNT_NUMS.count_nums(arr));
    }

    @Test
    void single_negative() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-123);
        assertEquals(0, COUNT_NUMS.count_nums(arr));
    }
}