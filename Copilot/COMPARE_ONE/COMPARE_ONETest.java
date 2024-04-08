package COMPARE_ONE;

import org.junit.Test;
import static org.junit.Assert.*;

public class COMPARE_ONETest {

    // Test with two integers, where the first integer is larger
    @Test
    public void test_compare_one_with_integers_first_larger() {
        Object a = 5;
        Object b = 3;
        Object expectedOutput = a;

        Object actualOutput = COMPARE_ONE.compare_one(a, b);

        assertEquals(expectedOutput, actualOutput);
    }

    // Test with two floats, where the second float is larger
    @Test
    public void test_compare_one_with_floats_second_larger() {
        Object a = 2.5;
        Object b = 3.7;
        Object expectedOutput = b;

        Object actualOutput = COMPARE_ONE.compare_one(a, b);

        assertEquals(expectedOutput, actualOutput);
    }

    // Test with two strings representing real numbers, where the first string is larger
    @Test
    public void test_compare_one_with_strings_first_larger() {
        Object a = "5.1";
        Object b = "4.9";
        Object expectedOutput = a;

        Object actualOutput = COMPARE_ONE.compare_one(a, b);

        assertEquals(expectedOutput, actualOutput);
    }
}