package FIB;

import org.junit.Test;
import static org.junit.Assert.*;

public class FIBTest {

    @Test
    public void testFib10() {
        assertEquals(55, FIB.fib(10));
    }

    @Test
    public void testFib1() {
        assertEquals(1, FIB.fib(1));
    }

    @Test
    public void testFib8() {
        assertEquals(21, FIB.fib(8));
    }
}