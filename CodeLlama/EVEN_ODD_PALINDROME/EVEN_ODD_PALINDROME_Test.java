package EVEN_ODD_PALINDROME;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EVEN_ODD_PALINDROME_Test {

@Test
public void testEvenOddPalindromeNormal() {
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2));
    List<Integer> actual = EVEN_ODD_PALINDROME.even_odd_palindrome(3);
    assertEquals(expected, actual);
}

@Test
public void testEvenOddPalindromeEdge1() {
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(4, 6));
    List<Integer> actual = EVEN_ODD_PALINDROME.even_odd_palindrome(12);
    assertEquals(expected, actual);
}
@Test
public void testEvenOddPalindromeEdge2() {
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 1));
    List<Integer> actual = EVEN_ODD_PALINDROME.even_odd_palindrome(1);
    assertEquals(expected, actual);
}
}