package DO_ALGEBRA;

import static org.junit.jupiter.api.Assertions.*;

import javax.script.ScriptException;

import org.junit.jupiter.api.Test;

public class DO_ALGEBRATest {

    @Test
    public void testDoAlgebraStandardCase() throws NumberFormatException, ScriptException {
        String[] operator = {"+", "*", "-"};
        int[] operand = {2, 3, 4, 5};
        double expectedResult = 9.0;
        double result = DO_ALGEBRA.do_algebra(operator, operand);
        assertEquals(expectedResult, result, "Standard case test failed");
    }

    @Test
    public void testDoAlgebraEqualCase() throws NumberFormatException, ScriptException {
        String[] operator = {"+", "*"};
        int[] operand = {2, 4, 8};
        double expectedResult = 20.0;
        double result = DO_ALGEBRA.do_algebra(operator, operand);
        assertEquals(expectedResult, result, "Equal case test failed");
    }

    @Test
    public void testDoAlgebraLessCase() throws NumberFormatException, ScriptException {
        String[] operator = {"+", "*", "-"};
        int[] operand = {1, 2, 3, 4};
        double expectedResult = 1.0;
        double result = DO_ALGEBRA.do_algebra(operator, operand);
        assertEquals(expectedResult, result, "Less case test failed");
    }
}