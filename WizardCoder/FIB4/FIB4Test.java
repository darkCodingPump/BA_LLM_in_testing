package FIB4;

import org.junit.Test;
import static org.junit.Assert.*;

public class FIB4Test {

    @Test
    public void testStandardCase() {
        assertEquals(14, FIB4.fib4(5));
    }

    @Test
    public void testEdgeCase1() {
        assertEquals(0, FIB4.fib4(1));
    }

    @Test
    public void testEdgeCase2() {
        assertEquals(2, FIB4.fib4(3));
    }
}