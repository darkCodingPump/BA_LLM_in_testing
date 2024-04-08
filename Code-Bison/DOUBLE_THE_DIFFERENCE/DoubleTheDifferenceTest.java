package DOUBLE_THE_DIFFERENCE;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoubleTheDifferenceTest {

    @Test
    void normalTest() {
        double[] lst = {1, 3, 2, 0};
        int result = DOUBLE_THE_DIFFERENCE.double_the_difference(lst);
        assertEquals(10, result);
    }

    @Test
    void negativeEdgeCase() {
        double[] lst = {-1, -2, 0};
        int result = DOUBLE_THE_DIFFERENCE.double_the_difference(lst);
        assertEquals(0, result);
    }

    @Test
    void specialNumberEdgeCase() {
        double[] lst = {9, -2};
        int result = DOUBLE_THE_DIFFERENCE.double_the_difference(lst);
        assertEquals(81, result);
    }
}