package BELOW_ZERO;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class BELOW_ZERO_Test {
    @Test
    public void testBelowZero() {
        List<Integer> operations = Arrays.asList(1, 2, 3, -4, 5);
        boolean result = BELOW_ZERO.below_zero(operations);
        assertEquals(true, result);
    }

    @Test
    public void testBelowZero2() {
        List<Integer> operations = Arrays.asList(1, 2, 3, 4, 5);
        boolean result = BELOW_ZERO.below_zero(operations);
        assertEquals(false, result);
    }

    @Test
    public void testBelowZero3() {
        List<Integer> operations = Arrays.asList(-1, -2, -3, -4, -5);
        boolean result = BELOW_ZERO.below_zero(operations);
        assertEquals(true, result);
    }
}