package CIRCULAR_SHIFT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CIRCULAR_SHIFTTest {

    @Test
    public void testStandardCase() {
        assertEquals("21", CIRCULAR_SHIFT.circular_shift(12, 1));
    }

    @Test
    public void testEdgeCase1() {
        assertEquals("12", CIRCULAR_SHIFT.circular_shift(12, 2));
    }

    @Test
    public void testEdgeCase2() {
        assertEquals("345", CIRCULAR_SHIFT.circular_shift(12345, 5));
    }
}