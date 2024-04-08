package ADD_EVEN_AT_ODD;

import org.junit.Test;
import static org.junit.Assert.*;

public class ADD_EVEN_AT_ODDTest {

    @Test
    public void testAddEvenAtOddNormalCase() {
        int[] lst = new int[] {4, 2, 6, 7};
        int expected = 2;
        int actual = ADD_EVEN_AT_ODD.add_even_at_odd(lst);
        assertEquals(expected, actual);
    }
    @Test
    public void testAddEvenAtOddEdgeCase1() {
        int[] lst = new int[] {4, 2, 6, 7, 8};
        int expected = 10;
        int actual = ADD_EVEN_AT_ODD.add_even_at_odd(lst);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddEvenAtOddEdgeCase2() {
        int[] lst = new int[] {4, 2, 6, 7, 8, 10};
        int expected = 18;
        int actual = ADD_EVEN_AT_ODD.add_even_at_odd(lst);
        assertEquals(expected, actual);
    }
}