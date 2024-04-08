package FIBFIB;

import org.junit.Test;
import static org.junit.Assert.*;

public class FIBFIBTest {

    @Test
    public void testFibfib() {
        int n = 1;
        int expected = 0;
        int actual = FIBFIB.fibfib(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testFibfibWithNegativeInput() {
        int n = -5;
        int expected = 0;
        int actual = FIBFIB.fibfib(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testFibfibWithLargeInput() {
        int n = 10;
        int expected = 144;
        int actual = FIBFIB.fibfib(n);
        assertEquals(expected, actual);
    }
}