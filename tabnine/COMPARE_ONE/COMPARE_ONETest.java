package COMPARE_ONE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class COMPARE_ONETest {

    @Test
    public void testStandardCase() {
        Object expectedResult = 2.5;
        Object actualResult = COMPARE_ONE.compare_one(1, 2.5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEqualCase() {
        Object expectedResult = null;
        Object actualResult = COMPARE_ONE.compare_one(1, 1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLessCase() {
        Object expectedResult = "2,3";
        Object actualResult = COMPARE_ONE.compare_one("2,3", 1);
        assertEquals(expectedResult, actualResult);
    }
}