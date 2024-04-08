package DOUBLE_THE_DIFFERENCE;

import org.junit.Test;
import static org.junit.Assert.*;

public class DOUBLE_THE_DIFFERENCE_Test {

    // Normal test case
    @Test
    public void test_normal_case() {
        double[] lst = {1, 3, 2, 0};
        int result = DOUBLE_THE_DIFFERENCE.double_the_difference(lst);
        assertEquals(10, result);
    }

    // Edge case: Empty list
    @Test
    public void test_empty_list() {
        double[] lst = {};
        int result = DOUBLE_THE_DIFFERENCE.double_the_difference(lst);
        assertEquals(0, result);
    }

    // Edge case: List with negative numbers
    @Test
    public void test_negative_numbers() {
        double[] lst = {-1, -2, 0};
        int result = DOUBLE_THE_DIFFERENCE.double_the_difference(lst);
        assertEquals(0, result);
    }
}