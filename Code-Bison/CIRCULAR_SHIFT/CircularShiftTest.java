package CIRCULAR_SHIFT;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CIRCULAR_SHIFTTest {

    @Test
    void normalCase() {
        String result = CIRCULAR_SHIFT.circular_shift(12345, 2);
        Assertions.assertEquals("45123", result);
    }

    @Test
    void edgeCase1() {
        String result = CIRCULAR_SHIFT.circular_shift(12345, 8);
        Assertions.assertEquals("54321", result);
    }

    @Test
    void edgeCase2() {
        String result = CIRCULAR_SHIFT.circular_shift(12345, 0);
        Assertions.assertEquals("12345", result);
    }
}