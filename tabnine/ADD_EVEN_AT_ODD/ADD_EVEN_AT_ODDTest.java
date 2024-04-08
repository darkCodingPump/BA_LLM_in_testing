package ADD_EVEN_AT_ODD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ADD_EVEN_AT_ODDTest {

    @Test
    public void testStandardCase() {
        int[] input = {4, 2, 6, 7};
        assertEquals(6, ADD_EVEN_AT_ODD.add_even_at_odd(input));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        assertEquals(0, ADD_EVEN_AT_ODD.add_even_at_odd(input));
    }

    @Test
    public void testOddArray() {
        int[] input = {1, 3, 5, 7};
        assertEquals(0, ADD_EVEN_AT_ODD.add_even_at_odd(input));
    }
}