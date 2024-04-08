package CHANGE_BASE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CHANGE_BASETest {

    @Test
    public void testStandardCase() {
        assertEquals("22", CHANGE_BASE.change_base(8, 3));
    }

    @Test
    public void testZeroCase() {
        assertEquals("0", CHANGE_BASE.change_base(0, 10));
    }

    @Test
    public void testNegativeCase() {
        assertEquals("-1", CHANGE_BASE.change_base(-1, 10));
    }
}