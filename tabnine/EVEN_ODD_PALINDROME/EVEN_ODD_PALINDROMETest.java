package EVEN_ODD_PALINDROME;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EVEN_ODD_PALINDROMETest {

    @Test
    public void testStandardCase() {
        int n = 10;
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(3, 4));
        ArrayList<Integer> actualResult = EVEN_ODD_PALINDROME.even_odd_palindrome(n);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEdgeCase1() {
        int n = 1;
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 1));
        ArrayList<Integer> actualResult = EVEN_ODD_PALINDROME.even_odd_palindrome(n);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEdgeCase2() {
        int n = 1000;
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(100, 100));
        ArrayList<Integer> actualResult = EVEN_ODD_PALINDROME.even_odd_palindrome(n);
        assertEquals(expectedResult, actualResult);
    }
}