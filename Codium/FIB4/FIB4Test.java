package FIB4;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

public class FIB4Test {


    // Should return 0 for input 0
    @Test
    public void test_return_zero_for_input_zero() {
        int result = FIB4.fib4(0);
        assertEquals(0, result);
    }

    // Should return 0 for negative inputs
    @Test
    public void test_return_zero_for_negative_inputs() {
        int result = FIB4.fib4(-1);
        assertEquals(0, result);
    
        result = FIB4.fib4(-5);
        assertEquals(0, result);
    
        result = FIB4.fib4(-10);
        assertEquals(0, result);
    }

    // Should return 0 for input 3
    @Test
    public void test_return_zero_for_input_three() {
        int result = FIB4.fib4(3);
        assertEquals(0, result);
    }
}