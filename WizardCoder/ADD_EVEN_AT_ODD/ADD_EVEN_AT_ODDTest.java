package ADD_EVEN_AT_ODD;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ADD_EVEN_AT_ODDTest {

    @Test
    public void testStandardCase() {
        int[] lst = {4, 2, 6, 7};
        assertEquals(10, ADD_EVEN_AT_ODD.add_even_at_odd(lst));
    }

    @Test
    public void testEdgeCase1() {
        int[] lst = {1, 3, 5, 7};
        assertEquals(0, ADD_EVEN_AT_ODD.add_even_at_odd(lst));
    }

    @Test
    public void testEdgeCase2() {
        int[] lst = {2, 4, 6, 8};
        assertEquals(20, ADD_EVEN_AT_ODD.add_even_at_odd(lst));
    }
}