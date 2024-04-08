package BELOW_ZERO;


import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class BELOW_ZERO_Test {

    // Normal case: The balance never goes below zero.
    @Test
    public void test_normal_case() {
        List<Integer> operations = new ArrayList<>();
        operations.add(10);
        operations.add(20);
        operations.add(30);
        operations.add(40);
        boolean result = BELOW_ZERO.below_zero(operations);
        assertFalse(result);
    }

    // Edge case: The balance goes below zero after the first operation.
    @Test
    public void test_balance_below_zero() {
        List<Integer> operations = new ArrayList<>();
        operations.add(10);
        operations.add(-20);
        operations.add(30);
        operations.add(40);
        boolean result = BELOW_ZERO.below_zero(operations);
        assertTrue(result);
    }

    // Edge case: The balance goes below zero after the last operation.
    @Test
    public void test_balance_below_zero_last_operation() {
        List<Integer> operations = new ArrayList<>();
        operations.add(10);
        operations.add(20);
        operations.add(30);
        operations.add(-100);
        boolean result = BELOW_ZERO.below_zero(operations);
        assertTrue(result);
    }
}