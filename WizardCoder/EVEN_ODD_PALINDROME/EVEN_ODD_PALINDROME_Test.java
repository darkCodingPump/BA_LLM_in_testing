package EVEN_ODD_PALINDROME;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class EVEN_ODD_PALINDROME_Test {

    @Test
    public void testEvenOddPalindrome() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 2));
        assertEquals(expected, EVEN_ODD_PALINDROME.even_odd_palindrome(4));
    }

    @Test
    public void testEvenOddPalindromeEdgeCase1() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 0));
        assertEquals(expected, EVEN_ODD_PALINDROME.even_odd_palindrome(1));
    }

    @Test
    public void testEvenOddPalindromeEdgeCase2() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 1));
        assertEquals(expected, EVEN_ODD_PALINDROME.even_odd_palindrome(2));
    }
}