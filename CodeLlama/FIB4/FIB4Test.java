package FIB4;

import org.junit.Test;
import static org.junit.Assert.*;

public class FIB4Test {

    @Test
    public void testFib4() {
        int n = 5;
        int expected = 4;
        int actual = FIB4.fib4(n);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFib4WithNegativeInput() {
        int n = -5;
        int expected = 0;
        int actual = FIB4.fib4(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testFib4WithLargeInput() {
        int n = 10;
        int expected = 128;
        int actual = FIB4.fib4(n);
        assertEquals(expected, actual);
    }
}