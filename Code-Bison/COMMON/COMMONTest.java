package COMMON;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class COMMONTest {

    @Test
    void testNormalCase() {
        int[] result = COMMON.common(new int[]{1, 4, 3, 34, 653, 2, 5}, new int[]{5, 7, 1, 5, 9, 653, 121});
        assertArrayEquals(new int[]{1, 5, 653}, result);
    }

    @Test
    void testEmptyList() {
        int[] result = COMMON.common(new int[]{}, new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void testNullList() {
        int[] result = COMMON.common(null, null);
        assertArrayEquals(new int[]{}, result);
    }
}