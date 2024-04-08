package DO_ALGEBRA;


import org.junit.Test;
import javax.script.ScriptException;
import static org.junit.Assert.assertEquals;

public class DO_ALGEBRA_Test {

    @Test
    public void testStandardCase() throws ScriptException {
        String[] operator = {"+", "-"};
        int[] operand = {1, 2, 3};
        double expected = 0;
        double actual = DO_ALGEBRA.do_algebra(operator, operand);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testEdgeCase1() throws ScriptException {
        String[] operator = {"+", "-", "*", "/"};
        int[] operand = {10, 2, 3, 4, 2};
        double expected = 0;
        double actual = DO_ALGEBRA.do_algebra(operator, operand);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testEdgeCase2() throws ScriptException {
        String[] operator = {"/", "*", "+", "-"};
        int[] operand = {10, 2, 5, 3, 1};
        double expected = 0;
        double actual = DO_ALGEBRA.do_algebra(operator, operand);
        assertEquals(expected, actual, 0.001);
    }
}