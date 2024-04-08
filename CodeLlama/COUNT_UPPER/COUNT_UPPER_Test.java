package COUNT_UPPER;

import org.junit.Test;
import static org.junit.Assert.*;

public class COUNT_UPPER_Test {
    @Test
    public void testCountUpper() {
        String s = "aBCdEf";
        int expected = 1;
        int actual = COUNT_UPPER.count_upper(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountUpperWithEmptyString() {
        String s = "";
        int expected = 0;
        int actual = COUNT_UPPER.count_upper(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountUpperWithNonUppercaseVowel() {
        String s = "dBBE";
        int expected = 0;
        int actual = COUNT_UPPER.count_upper(s);
        assertEquals(expected, actual);
    }
}