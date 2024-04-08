package CIRCULAR_SHIFT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CIRCULAR_SHIFT_Test {

    @Test
    public void testCircularShift1() {
        assertEquals("21", CIRCULAR_SHIFT.circular_shift(12, 1));
    }

    @Test
    public void testCircularShift2() {
        assertEquals("12", CIRCULAR_SHIFT.circular_shift(12, 2));
    }

    @Test
    public void testCircularShift3() {
        assertEquals("12", CIRCULAR_SHIFT.circular_shift(12, 3));
    }
}