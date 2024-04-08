package FIBFIB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FIBFIBTest {

    @Test
    void testNormal() {
        assertEquals(4, FIBFIB.fibfib(5));
    }

    @Test
    void testEdgeCase1() {
        assertEquals(24, FIBFIB.fibfib(8));
    }

    @Test
    void testEdgeCase2() {
        assertEquals(0, FIBFIB.fibfib(0));
    }
}