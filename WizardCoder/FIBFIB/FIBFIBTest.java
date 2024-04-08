package FIBFIB;


import org.junit.Test;
import static org.junit.Assert.*;

public class FIBFIBTest {

    @Test
    public void testStandardCase() {
        assertEquals(2, FIBFIB.fibfib(4));
    }

    @Test
    public void testEdgeCase1() {
        assertEquals(0, FIBFIB.fibfib(0));
    }

    @Test
    public void testEdgeCase2() {
        assertEquals(0, FIBFIB.fibfib(1));
    }
}