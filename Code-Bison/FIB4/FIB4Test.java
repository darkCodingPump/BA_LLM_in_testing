package FIB4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FIB4Test {

    @Test
    void normal_input() {
        assertEquals(4, FIB4.fib4(5));
        assertEquals(8, FIB4.fib4(6));
        assertEquals(14, FIB4.fib4(7));
    }

    @Test
    void edge_case_one() {
        assertEquals(0, FIB4.fib4(0));
    }

    @Test
    void edge_case_two() {
        assertEquals(2, FIB4.fib4(2));
    }
}