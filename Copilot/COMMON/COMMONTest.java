package COMMON;

import org.junit.Test;
import static org.junit.Assert.*;

public class COMMONTest {

    // Normal test case
    @Test
    public void test_common_normal() {
        int[] l1 = {1, 4, 3, 34, 653, 2, 5};
        int[] l2 = {5, 7, 1, 5, 9, 653, 121};
        int[] expected = {1, 5, 653};
        int[] result = COMMON.common(l1, l2);
        assertArrayEquals(expected, result);
    }

    // Edge case: Empty lists
    @Test
    public void test_common_empty_lists() {
        int[] l1 = {};
        int[] l2 = {};
        int[] expected = {};
        int[] result = COMMON.common(l1, l2);
        assertArrayEquals(expected, result);
    }

    // Edge case: No common elements
    @Test
    public void test_common_no_common_elements() {
        int[] l1 = {5, 3, 2, 8};
        int[] l2 = {9, 7, 6};
        int[] expected = {};
        int[] result = COMMON.common(l1, l2);
        assertArrayEquals(expected, result);
    }
}