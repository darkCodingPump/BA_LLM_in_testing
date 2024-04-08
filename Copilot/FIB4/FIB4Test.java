package FIB4;

import org.junit.Test;
import static org.junit.Assert.*;

public class FIB4Test {

    // Normal test case
    @Test
    public void test_fib4_normal() {
        int n = 5;
        int expected = 4;
        int result = FIB4.fib4(n);
        assertEquals(expected, result);
    }

    // Edge case: n = 0
    @Test
    public void test_fib4_edge_case_0() {
        int n = 0;
        int expected = 0;
        int result = FIB4.fib4(n);
        assertEquals(expected, result);
    }

    // Edge case: n = 1
    @Test
    public void test_fib4_edge_case_1() {
        int n = 1;
        int expected = 0;
        int result = FIB4.fib4(n);
        assertEquals(expected, result);
    }
}