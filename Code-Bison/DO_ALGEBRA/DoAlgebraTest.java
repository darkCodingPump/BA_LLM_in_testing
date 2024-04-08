package DO_ALGEBRA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestDO_ALGEBRA {

    @Test
    void testNormalCase() throws Exception {
        String[] operator = {"+", "*", "-"};
        int[] operand = {2, 3, 4, 5};
        double result = DO_ALGEBRA.do_algebra(operator, operand);
        assertEquals(9, result);
    }

    @Test
    void testEmptyInput() throws Exception {
        String[] operator = {};
        int[] operand = {};
        assertThrows(IllegalArgumentException.class, () -> DO_ALGEBRA.do_algebra(operator, operand));
    }

    @Test
    void testNullInput() throws Exception {
        assertThrows(NullPointerException.class, () -> DO_ALGEBRA.do_algebra(null, null));
    }
}