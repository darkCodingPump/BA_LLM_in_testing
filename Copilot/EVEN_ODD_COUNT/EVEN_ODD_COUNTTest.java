package EVEN_ODD_COUNT;

import org.junit.Test;
import static org.junit.Assert.*;

public class EVEN_ODD_COUNTTest {

    // Normal test case
    @Test
    public void test_even_odd_count_normal() {
        int[] result = EVEN_ODD_COUNT.even_odd_count(123);
        assertArrayEquals(new int[] {1, 2}, result);
    }

    // Edge case: Negative number with all even digits
    @Test
    public void test_even_odd_count_all_even() {
        int[] result = EVEN_ODD_COUNT.even_odd_count(-2468);
        assertArrayEquals(new int[] {4, 0}, result);
    }

    // Edge case: Zero
    @Test
    public void test_even_odd_count_zero() {
        int[] result = EVEN_ODD_COUNT.even_odd_count(0);
        assertArrayEquals(new int[] {1, 0}, result);
    }
}