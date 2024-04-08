package DIGITS;

import org.junit.Test;

import static org.junit.Assert.*;

public class DIGITSTest {@Test
public void testNormalCase() {
    int n = 235;
    int expected = 15;
    int actual = DIGITS.digits(n);
    assertEquals(expected, actual);
}
@Test
public void testAllEvenDigits() {
    int n = 4;
    int expected = 0;
    int actual = DIGITS.digits(n);
    assertEquals(expected, actual);
}@Test
public void testSingleDigit() {
    int n = 1;
    int expected = 1;
    int actual = DIGITS.digits(n);
    assertEquals(expected, actual);
}
}