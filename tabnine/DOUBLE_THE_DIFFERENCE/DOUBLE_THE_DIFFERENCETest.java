package DOUBLE_THE_DIFFERENCE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DOUBLE_THE_DIFFERENCETest {

    @Test
    public void testDoubleTheDifferenceStandardCase() {
        double[] input = {1, 3, 2, 0};
        int expectedResult = 10;
        int result = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        assertEquals(expectedResult, result, "Standard case test failed");
    }

    @Test
    public void testDoubleTheDifferenceAllNegativeNumbers() {
        double[] input = {-1, -2, 0};
        int expectedResult = 0;
        int result = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        assertEquals(expectedResult, result, "All negative numbers test failed");
    }

    @Test
    public void testDoubleTheDifferenceAllEvenNumbers() {
        double[] input = {2, 4, 6};
        int expectedResult = 0;
        int result = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        assertEquals(expectedResult, result, "All even numbers test failed");
    }
}