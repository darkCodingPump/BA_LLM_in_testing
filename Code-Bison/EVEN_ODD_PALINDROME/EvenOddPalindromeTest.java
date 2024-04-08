package EVEN_ODD_PALINDROME;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

class EVEN_ODD_PALINDROME_Tests {

    @Test
    void normalCase() {
        int n = 20;
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(5, 4));
        assertEquals(expectedResult, EVEN_ODD_PALINDROME.even_odd_palindrome(n));
    }

    @Test
    void edgeCase1() {
        int n = 0;
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(0, 0));
        assertEquals(expectedResult, EVEN_ODD_PALINDROME.even_odd_palindrome(n));
    }

    @Test
    void edgeCase2() {
        int n = 1;
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(0, 1));
        assertEquals(expectedResult, EVEN_ODD_PALINDROME.even_odd_palindrome(n));
    }
}