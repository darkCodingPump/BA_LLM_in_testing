package BELOW_ZERO;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BELOW_ZERO_Test {

    @Test
    public void testBelowZero() {
        List<Integer> operations = Arrays.asList(10, -20, 30, -40, 50);
        assertTrue(BELOW_ZERO.below_zero(operations));
    }

    @Test
    public void testBelowZeroEdgeCase1() {
        List<Integer> operations = Arrays.asList(10, 20, 30, 40, 50);
        assertFalse(BELOW_ZERO.below_zero(operations));
    }

    @Test
    public void testBelowZeroEdgeCase2() {
        List<Integer> operations = Arrays.asList(-10, -20, -30, -40, -50);
        assertTrue(BELOW_ZERO.below_zero(operations));
    }
}