package CHANGE_BASE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CHANGE_BASETest {
    @Test
    void testNormalCase() {
        assertEquals("111", CHANGE_BASE.change_base(7, 2));
    }

    @Test
    void testEdgeCaseZeroBase() {
        assertEquals("0", CHANGE_BASE.change_base(10, 0));
    }

    @Test
    void testEdgeCaseNegativeInput() {
        assertEquals("-22", CHANGE_BASE.change_base(-8, 3));
    }
}