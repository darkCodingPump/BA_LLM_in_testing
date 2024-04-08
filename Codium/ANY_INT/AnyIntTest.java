package ANY_INT;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

public class AnyIntTest {


    // Should return true when one of the numbers is equal to the sum of the other two and all numbers are integers
    @Test
    public void test_true_when_one_number_is_equal_to_sum_of_other_two_and_all_numbers_are_integers() {
        assertTrue(ANY_INT.any_int(5, 2, 7));
        assertTrue(ANY_INT.any_int(3, -2, 1));
    }

    // Should return false when all numbers are zero
    @Test
    public void test_false_when_all_numbers_are_zero() {
        assertFalse(ANY_INT.any_int(0, 0, 0));
    }

    // Should return false when two numbers are zero and the third is non-zero
    @Test
    public void test_false_when_two_numbers_are_zero_and_the_third_is_non_zero() {
        assertFalse(ANY_INT.any_int(0, 0, 1));
        assertFalse(ANY_INT.any_int(0, 1, 0));
        assertFalse(ANY_INT.any_int(1, 0, 0));
    }
}