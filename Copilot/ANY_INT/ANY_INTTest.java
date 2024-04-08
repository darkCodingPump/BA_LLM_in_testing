package ANY_INT;

import org.junit.Test;
import static org.junit.Assert.*;

public class ANY_INTTest {

    // Normal test case
    @Test
    public void test_normal_case() {
        boolean result = ANY_INT.any_int(5, 2, 7);
        assertTrue(result);
    }

    // Edge case: All numbers are equal
    @Test
    public void test_all_numbers_equal() {
        boolean result = ANY_INT.any_int(3, 3, 3);
        assertFalse(result);
    }

    // Edge case: One number is zero
    @Test
    public void test_one_number_zero() {
        boolean result = ANY_INT.any_int(0, 2, 2);
        assertTrue(result);
    }
}