package FIBFIB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FIBFIBTest {

    @Test
    public void testStandardCase() {
        assertEquals(4, FIBFIB.fibfib(5));
    }

    @Test
    public void testEdgeCase1() {
        assertEquals(1, FIBFIB.fibfib(2));
    }

    @Test
    public void testEdgeCase2() {
        assertEquals(0, FIBFIB.fibfib(0));
    }
}