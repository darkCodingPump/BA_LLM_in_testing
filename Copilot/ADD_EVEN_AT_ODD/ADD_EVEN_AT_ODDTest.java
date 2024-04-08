package ADD_EVEN_AT_ODD;

import org.junit.Test;
import static org.junit.Assert.*;

public class ADD_EVEN_AT_ODDTest {

    // Normal test case
    @Test
    public void test_add_even_at_odd_normal() {
        int[] lst = {4, 2, 6, 7};
        int result = ADD_EVEN_AT_ODD.add_even_at_odd(lst);
        assertEquals(2, result);
    }

    // Edge case: Empty list
    @Test
    public void test_add_even_at_odd_empty_list() {
        int[] lst = {};
        int result = ADD_EVEN_AT_ODD.add_even_at_odd(lst);
        assertEquals(0, result);
    }

    // Edge case: List with only odd elements
    @Test
    public void test_add_even_at_odd_only_odd_elements() {
        int[] lst = {1, 3, 5, 7};
        int result = ADD_EVEN_AT_ODD.add_even_at_odd(lst);
        assertEquals(0, result);
    }
}