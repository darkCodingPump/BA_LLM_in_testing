package DOUBLE_THE_DIFFERENCE;
import org.junit.Test;
import static org.junit.Assert.*;

public class DOUBLE_THE_DIFFERENCE_Test {

    @Test
    public void testStandardCase() {
        double[] lst = {1.0, 2.0, 3.0, 4.0, 5.0};
        int expected = 16;
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(lst);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCase1() {
        double[] lst = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        int expected = 36;
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(lst);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCase2() {
        double[] lst = {-1.0, -2.0, -3.0, -4.0, -5.0};
        int expected = 0;
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(lst);
        assertEquals(expected, actual);
    }
}