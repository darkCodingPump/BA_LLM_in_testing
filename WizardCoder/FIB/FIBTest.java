package FIB;
import org.junit.Test;
import static org.junit.Assert.*;

public class FIBTest {

    @Test
    public void testFibStandardCase() {
        assertEquals(5, FIB.fib(5));
    }

    @Test
    public void testFibEdgeCase1() {
        assertEquals(0, FIB.fib(0));
    }

    @Test
    public void testFibEdgeCase2() {
        assertEquals(1, FIB.fib(1));
    }
}