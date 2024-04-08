package COMMON;

import org.junit.Test;
import static org.junit.Assert.*;

public class COMMONTest {

    @Test
    public void testCommon() {
        int[] l1 = {1, 2, 3, 4, 5};
        int[] l2 = {4, 5, 6, 7, 8};
        int[] expected = {4, 5};
        assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test
    public void testCommonEdgeCase1() {
        int[] l1 = {1, 2, 3, 4, 5};
        int[] l2 = {6, 7, 8, 9, 10};
        int[] expected = {};
        assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test
    public void testCommonEdgeCase2() {
        int[] l1 = {1, 1, 1, 1, 1};
        int[] l2 = {1, 1, 1, 1, 1};
        int[] expected = {1};
        assertArrayEquals(expected, COMMON.common(l1, l2));
    }
}