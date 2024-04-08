package FIB;

import org.junit.Test;
import static org.junit.Assert.*;

public class FIBTest {

    // Test case for a normal input
    @Test
    public void test_fib_normal() {
        int n = 10;
        int expected = 55;
        int result = FIB.fib(n);
        assertEquals(expected, result);
    }

    // Test case for the edge case where n is 0
    @Test
    public void test_fib_edge_case_0() {
        int n = 0;
        int expected = 0;
        int result = FIB.fib(n);
        assertEquals(expected, result);
    }

    // Test case for the edge case where n is 1
    @Test
    public void test_fib_edge_case_1() {
        int n = 1;
        int expected = 1;
        int result = FIB.fib(n);
        assertEquals(expected, result);
    }
}