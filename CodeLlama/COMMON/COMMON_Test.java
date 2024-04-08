package COMMON;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class COMMON_Test {

    @Test
    public void testCommon1() {
        int[] l1 = {1, 4, 3, 34, 653, 2, 5};
        int[] l2 = {5, 7, 1, 5, 9, 653, 121};
        int[] expected = {1, 5, 653};
        assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test
    public void testCommon2() {
        int[] l1 = {5, 3, 2, 8};
        int[] l2 = {3, 2};
        int[] expected = {2, 3};
        assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test
    public void testCommon3() {
        int[] l1 = {1, 2, 3, 4, 5};
        int[] l2 = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, COMMON.common(l1, l2));
    }
}