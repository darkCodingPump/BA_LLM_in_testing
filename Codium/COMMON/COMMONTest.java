package COMMON;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

public class COMMONTest {


    // Verify that the method returns the correct common elements for two lists with different sizes.
    @Test
    public void test_common_elements_different_sizes() {
        int[] l1 = {1, 4, 3, 34, 653, 2, 5};
        int[] l2 = {5, 7, 1, 5, 9, 653, 121};
        int[] expected = {1, 5, 653};
        int[] result = COMMON.common(l1, l2);
        assertArrayEquals(expected, result);
    }

    // Verify that the method returns an empty array when one of the lists is empty.
    @Test
    public void test_common_elements_one_empty_list() {
        int[] l1 = {5, 3, 2, 8};
        int[] l2 = {};
        int[] expected = {};
        int[] result = COMMON.common(l1, l2);
        assertArrayEquals(expected, result);
    }

    // Verify that the method returns an empty array when both lists are empty.
    @Test
    public void test_empty_arrays() {
        int[] l1 = {};
        int[] l2 = {};
        int[] expected = {};
        int[] result = COMMON.common(l1, l2);
        assertArrayEquals(expected, result);
    }
}