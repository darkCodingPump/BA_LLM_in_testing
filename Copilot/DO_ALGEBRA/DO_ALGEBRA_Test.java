package DO_ALGEBRA;

import org.junit.Test;
import static org.junit.Assert.*;

import javax.script.ScriptException;

public class DO_ALGEBRA_Test {

    // Normal test case
     @Test
    public void test_do_algebra_normal() throws NumberFormatException, ScriptException {
        String[] operator = {"+", "*", "-"};
        int[] operand = {2, 3, 4, 5};
        double expected = 9.0;
        double result = DO_ALGEBRA.do_algebra(operator, operand);
        assertEquals(expected, result, 0.001);
    }

    // Edge case: Single operator and two operands
    @Test
    public void test_do_algebra_single_operator() throws NumberFormatException, ScriptException {
        String[] operator = {"*"};
        int[] operand = {2, 3};
        double expected = 6.0;
        double result = DO_ALGEBRA.do_algebra(operator, operand);
        assertEquals(expected, result, 0.001);
    }

    // Edge case: Multiple operators and two operands
    @Test
    public void test_do_algebra_multiple_operators() throws NumberFormatException, ScriptException {
        String[] operator = {"+", "-", "*"};
        int[] operand = {2, 3};
        double expected = -1.0;
        double result = DO_ALGEBRA.do_algebra(operator, operand);
        assertEquals(expected, result, 0.001);
    } 
}