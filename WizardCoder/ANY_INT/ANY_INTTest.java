package ANY_INT;

import org.junit.Test;
import static org.junit.Assert.*;

public class ANY_INTTest {

    @Test
    public void testStandardCase() {
        assertTrue(ANY_INT.any_int(5, 2, 7));
    }

    @Test
    public void testEdgeCase1() {
        assertFalse(ANY_INT.any_int(3, 2, 2));
    }

    @Test
    public void testEdgeCase2() {
        assertTrue(ANY_INT.any_int(3, -2, 1));
    }

/*     @Test
    public void testEdgeCase3() {
        assertFalse(ANY_INT.any_int(3.6, -2.2, 2));
    } */
}