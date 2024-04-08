package DIGITS;


import org.junit.Test;
import static org.junit.Assert.*;

public class DIGITSTest {

    @Test
    public void testDigitsStandardCase() {
        assertEquals(15, DIGITS.digits(12345));
    }

    @Test
    public void testDigitsEdgeCase1() {
        assertEquals(0, DIGITS.digits(2468));
    }

    @Test
    public void testDigitsEdgeCase2() {
        assertEquals(1, DIGITS.digits(1));
    }
}