package EVEN_ODD_PALINDROME;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class EVEN_ODD_PALINDROME_Test {

    // Normal test case
    @Test
    public void test_even_odd_palindrome_normal() {
        int n = 12;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 6));
        ArrayList<Integer> result = EVEN_ODD_PALINDROME.even_odd_palindrome(n);
        assertEquals(expected, result);
    }

    // Edge case: n = 1
    @Test
    public void test_even_odd_palindrome_edge_case_1() {
        int n = 1;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1));
        ArrayList<Integer> result = EVEN_ODD_PALINDROME.even_odd_palindrome(n);
        assertEquals(expected, result);
    }

    // Edge case: n = 1000
     @Test
    public void test_even_odd_palindrome_edge_case_1000() {
        int n = 1000;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(45, 55));
        ArrayList<Integer> result = EVEN_ODD_PALINDROME.even_odd_palindrome(n);
        assertEquals(expected, result);
    } 
}