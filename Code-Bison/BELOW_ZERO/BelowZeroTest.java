package BELOW_ZERO;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BelowZeroTest {

    @Test
    void testNormalCase() {
        List<Integer> operations = Arrays.asList(2, 3, -5, 6, -8, 0);
        assertTrue(BELOW_ZERO.below_zero(operations));
    }

    @Test
    void testEmptyList() {
        List<Integer> operations = Arrays.asList();
        assertFalse(BELOW_ZERO.below_zero(operations));
    }

    @Test
    void testAllNegativeList() {
        List<Integer> operations = Arrays.asList(-1, -2, -3, -4, -5);
        assertTrue(BELOW_ZERO.below_zero(operations));
    }
}