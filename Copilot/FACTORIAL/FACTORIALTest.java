package FACTORIAL;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class FACTORIALTest {

    // Normal test case
    @Test
    public void test_factorial_normal() {
        int n = 5;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 6, 24, 15));
        ArrayList<Integer> result = FACTORIAL.factorial(n);
        assertEquals(expected, result);
    }

    // Edge case: n = 0
    @Test
    public void test_factorial_zero() {
        int n = 0;
        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> result = FACTORIAL.factorial(n);
        assertEquals(expected, result);
    }

    // Edge case: n = 1
    @Test
    public void test_factorial_one() {
        int n = 1;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> result = FACTORIAL.factorial(n);
        assertEquals(expected, result);
    }
}