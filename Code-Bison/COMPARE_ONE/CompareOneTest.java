package COMPARE_ONE;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompareOneTest {

    @Test
    public void testNormalCase() {
        Object result = COMPARE_ONE.compare_one(1.5, 2);
        assertEquals(2.0, result);
    }

    @Test
    public void testEdgeCase1() {
        Object result = COMPARE_ONE.compare_one(1, "2.3");
        assertEquals("2.3", result);
    }

    @Test
    public void testEdgeCase2() {
        Object result = COMPARE_ONE.compare_one("5.1", 5.1);
        assertEquals(null, result);
    }
}