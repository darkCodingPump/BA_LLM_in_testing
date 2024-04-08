package BELOW_ZERO;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class BELOW_ZEROTest {

    @Test
    public void testBelowZeroStandardCase() {
        List<Integer> operations = List.of(1, 2, 3, -4, 5);
        assertTrue(BELOW_ZERO.below_zero(operations));
    }

    @Test
    public void testBelowZeroEqualCase() {
        List<Integer> operations = List.of(-1, -2, -3, -4, -5);
        assertTrue(BELOW_ZERO.below_zero(operations));
    }

    @Test
    public void testBelowZeroLessCase() {
        List<Integer> operations = List.of(1, 2, 3, 4, 5);
        assertFalse(BELOW_ZERO.below_zero(operations));
    }
}