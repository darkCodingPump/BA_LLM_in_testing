package FIBFIB;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

public class FIBFIBTest {


    // Returns 0 when n is 0
    @Test
    public void test_returns_zero_when_n_is_zero() {
        int result = FIBFIB.fibfib(0);
        assertEquals(0, result);
    }

    // Returns a negative value when n is negative
    @Test
    public void test_returns_negative_value_when_n_is_negative() {
        int result = FIBFIB.fibfib(-1);
        assertTrue(result < 0);
    }

    // Returns the correct value for n=100
/*     @Test
    public void test_returns_correct_value_for_n_100() {
        int result = FIBFIB.fibfib(100);
        assertEquals(927372692193078999L, result);
    } */
}