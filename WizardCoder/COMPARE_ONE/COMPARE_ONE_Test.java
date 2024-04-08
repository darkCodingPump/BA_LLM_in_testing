package COMPARE_ONE;

import org.junit.Test;
import static org.junit.Assert.*;

public class COMPARE_ONE_Test {

    @Test
    public void testStandardCase() {
        Object a = 10.0;
        Object b = 5.0;
        Object expected = a;
        Object result = COMPARE_ONE.compare_one(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testEdgeCase1() {
        Object a = 10;
        Object b = 10;
        Object expected = null;
        Object result = COMPARE_ONE.compare_one(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testEdgeCase2() {
        Object a = "10,5";
        Object b = 10.5;
        Object expected = b;
        Object result = COMPARE_ONE.compare_one(a, b);
        assertEquals(expected, result);
    }
}