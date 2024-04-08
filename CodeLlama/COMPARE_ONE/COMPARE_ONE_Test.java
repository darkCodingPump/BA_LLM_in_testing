package COMPARE_ONE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class COMPARE_ONE_Test {

    @Test
    public void testCompareOne1() {
        assertEquals(2.5, COMPARE_ONE.compare_one(1, 2.5));
    }

    @Test
    public void testCompareOne2() {
        assertEquals("2,3", COMPARE_ONE.compare_one(1, "2,3"));
    }

    @Test
    public void testCompareOne3() {
        assertEquals("6", COMPARE_ONE.compare_one("5,1", "6"));
    }
}