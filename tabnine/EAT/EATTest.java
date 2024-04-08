package EAT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EATTest {

    @Test
    public void testEatStandardCase() {
        int[] expectedResult = {11, 4};
        int[] result = EAT.eat(5, 6, 10);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testEatEqualCase() {
        int[] expectedResult = {12, 1};
        int[] result = EAT.eat(4, 8, 9);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testEatLessCase() {
        int[] expectedResult = {11, 0};
        int[] result = EAT.eat(2, 11, 5);
        assertArrayEquals(expectedResult, result);
    }
}