package FACTORIZE;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class FACTORIZE_Test {

    // Normal test case
    @Test
    public void test_factorize_normal() {
        int n = 24;
        List<Integer> expected = Arrays.asList(2, 2, 2, 3);
        List<Integer> result = FACTORIZE.factorize(n);
        assertEquals(expected, result);
    }

    // Edge case: n is a prime number
    @Test
    public void test_factorize_prime() {
        int n = 17;
        List<Integer> expected = Arrays.asList(17);
        List<Integer> result = FACTORIZE.factorize(n);
        assertEquals(expected, result);
    }

    // Edge case: n is 1
    @Test
    public void test_factorize_one() {
        int n = 1;
        List<Integer> expected = Arrays.asList();
        List<Integer> result = FACTORIZE.factorize(n);
        assertEquals(expected, result);
    }
}