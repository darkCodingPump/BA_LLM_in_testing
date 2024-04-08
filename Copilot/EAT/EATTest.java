package EAT;

import org.junit.Test;
import static org.junit.Assert.*;

public class EATTest {

    // Normal case: enough remaining carrots to meet the need
    @Test
    public void test_normal_case() {
        int[] result = EAT.eat(5, 6, 10);
        assertEquals(11, result[0]);
        assertEquals(4, result[1]);
    }

    // Edge case: not enough remaining carrots, eat all remaining
    @Test
    public void test_edge_case1() {
        int[] result = EAT.eat(4, 8, 9);
        assertEquals(12, result[0]);
        assertEquals(1, result[1]);
    }

    // Edge case: not enough remaining carrots, eat all remaining
    @Test
    public void test_edge_case2() {
        int[] result = EAT.eat(1, 10, 10);
        assertEquals(11, result[0]);
        assertEquals(0, result[1]);
    }
}