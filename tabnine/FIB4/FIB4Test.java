package FIB4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FIB4Test {

    @Test
    public void testFib4StandardCase() {
        assertEquals(4, FIB4.fib4(5));
    }

    @Test
    public void testFib4EdgeCase1() {
        assertEquals(2, FIB4.fib4(4));
    }

    @Test
    public void testFib4EdgeCase2() {
        assertEquals(0, FIB4.fib4(1));
    }
}