package DOUBLE_THE_DIFFERENCE;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DOUBLE_THE_DIFFERENCE_Test {
    @Test
    public void testEmptyList() {
        double[] lst = {};
        int expected = 0;
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(lst);
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeNumbers() {
        double[] lst = {-1, -2, 0};
        int expected = 0;
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(lst);
        assertEquals(expected, actual);
    }

    @Test
    public void testNonIntegerNumbers() {
        double[] lst = {1.5, 2.5, 3.5};
        int expected = 0;
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(lst);
        assertEquals(expected, actual);
    }
}