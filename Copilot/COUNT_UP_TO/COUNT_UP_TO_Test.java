package COUNT_UP_TO;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class COUNT_UP_TO_Test {

    // Normal test case
    @Test
    public void test_count_up_to_normal() {
        int n = 20;
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
        List<Integer> result = COUNT_UP_TO.count_up_to(n);
        assertEquals(expected, result);
    }

    // Edge case: n = 0
    @Test
    public void test_count_up_to_zero() {
        int n = 0;
        List<Integer> expected = Arrays.asList();
        List<Integer> result = COUNT_UP_TO.count_up_to(n);
        assertEquals(expected, result);
    }

    // Edge case: n = 1
    @Test
    public void test_count_up_to_one() {
        int n = 1;
        List<Integer> expected = Arrays.asList();
        List<Integer> result = COUNT_UP_TO.count_up_to(n);
        assertEquals(expected, result);
    }
}