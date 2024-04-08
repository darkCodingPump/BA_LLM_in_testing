package CIRCULAR_SHIFT;


import org.junit.Test;
import static org.junit.Assert.*;

public class CIRCULAR_SHIFTTest {

    @Test
    public void testCircularShift() {
        assertEquals("12345", CIRCULAR_SHIFT.circular_shift(12345, 0));
    }

    @Test
    public void testCircularShiftEdgeCase1() {
        assertEquals("51234", CIRCULAR_SHIFT.circular_shift(12345, 1));
    }

    @Test
    public void testCircularShiftEdgeCase2() {
        assertEquals("45123", CIRCULAR_SHIFT.circular_shift(12345, 2));
    }
}