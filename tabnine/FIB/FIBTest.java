package FIB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FIBTest {

    @Test
    public void testStandardCase() {
        assertEquals(55, FIB.fib(10));
    }

    @Test
    public void testEdgeCase1() {
        assertEquals(1, FIB.fib(1));
    }

    @Test
    public void testEdgeCase2() {
        assertEquals(0, FIB.fib(0));
    }
}