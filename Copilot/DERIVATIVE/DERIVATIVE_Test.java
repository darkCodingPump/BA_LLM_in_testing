package DERIVATIVE;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DERIVATIVE_Test {

    // Normal test case
    @Test
    public void test_derivative_normal() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(3, 1, 2, 4, 5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 4, 12, 20));
        List<Integer> result = DERIVATIVE.derivative(xs);
        assertEquals(expected, result);
    }

    // Edge case: Empty list
    @Test
    public void test_derivative_empty_list() {
        List<Integer> xs = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = DERIVATIVE.derivative(xs);
        assertEquals(expected, result);
    }

    // Edge case: Single element list
    @Test
    public void test_derivative_single_element() {
        List<Integer> xs = new ArrayList<>(Arrays.asList(5));
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = DERIVATIVE.derivative(xs);
        assertEquals(expected, result);
    }
}