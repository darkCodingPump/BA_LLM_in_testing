package COMMON;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class COMMONTest {

    @Test
    public void testCommonStandardCase() {
        int[] l1 = {1, 4, 3, 34, 653, 2, 5};
        int[] l2 = {5, 7, 1, 5, 9, 653, 121};
        int[] expectedResult = {1, 5, 653};
        int[] result = COMMON.common(l1, l2);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testCommonEqualCase() {
        int[] l1 = {5, 3, 2, 8};
        int[] l2 = {3, 2};
        int[] expectedResult = {2, 3};
        int[] result = COMMON.common(l1, l2);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testCommonLessCase() {
        int[] l1 = {1, 2, 3, 4, 5};
        int[] l2 = {1, 2, 3};
        int[] expectedResult = {1, 2, 3};
        int[] result = COMMON.common(l1, l2);
        assertArrayEquals(expectedResult, result);
    }
}