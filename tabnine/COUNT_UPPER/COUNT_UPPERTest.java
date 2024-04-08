package COUNT_UPPER;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class COUNT_UPPERTest {

    @Test
    public void testCountUpperStandardCase() {
        assertEquals(1, COUNT_UPPER.count_upper("aBCdEf"));
    }

    @Test
    public void testCountUpperNoUpperCaseVowels() {
        assertEquals(0, COUNT_UPPER.count_upper("abcdefg"));
    }

    @Test
    public void testCountUpperMixedCase() {
        assertEquals(0, COUNT_UPPER.count_upper("dBBE"));
    }
}