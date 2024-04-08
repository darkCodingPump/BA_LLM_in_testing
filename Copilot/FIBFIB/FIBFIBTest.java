package FIBFIB;

import org.junit.Test;
import static org.junit.Assert.*;

public class FIBFIBTest {

    // Normal case: Testing the fibfib() method with a normal input.
    @Test
    public void test_fibfib_normal() {
        int n = 5;
        int expected = 4;
        int result = FIBFIB.fibfib(n);
        assertEquals(expected, result);
    }

    // Edge case: Testing the fibfib() method with n = 0.
    @Test
    public void test_fibfib_edge_case_0() {
        int n = 0;
        int expected = 0;
        int result = FIBFIB.fibfib(n);
        assertEquals(expected, result);
    }

    // Edge case: Testing the fibfib() method with n = 8.
    @Test
    public void test_fibfib_edge_case_8() {
        int n = 8;
        int expected = 24;
        int result = FIBFIB.fibfib(n);
        assertEquals(expected, result);
    }
}