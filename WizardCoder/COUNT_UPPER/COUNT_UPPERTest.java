package COUNT_UPPER;

import org.junit.Test;
import static org.junit.Assert.*;

public class COUNT_UPPERTest {

    @Test
    public void testCountUpper() {
        assertEquals(2, COUNT_UPPER.count_upper("AEIOU"));
    }

    @Test
    public void testCountUpperEdgeCase1() {
        assertEquals(0, COUNT_UPPER.count_upper("aeiou"));
    }

    @Test
    public void testCountUpperEdgeCase2() {
        assertEquals(0, COUNT_UPPER.count_upper(""));
    }
}