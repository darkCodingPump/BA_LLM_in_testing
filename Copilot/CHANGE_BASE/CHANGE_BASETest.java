package CHANGE_BASE;

import org.junit.Test;
import static org.junit.Assert.*;

public class CHANGE_BASETest {

    // Normal case: Convert 8 to base 3
    @Test
    public void test_normal_case() {
        int x = 8;
        int base = 3;
        String expected = "22";
        String result = CHANGE_BASE.change_base(x, base);
        assertEquals(expected, result);
    }

    // Edge case: Convert 8 to base 2
    @Test
    public void test_edge_case1() {
        int x = 8;
        int base = 2;
        String expected = "1000";
        String result = CHANGE_BASE.change_base(x, base);
        assertEquals(expected, result);
    }

    // Edge case: Convert 7 to base 2
    @Test
    public void test_edge_case2() {
        int x = 7;
        int base = 2;
        String expected = "111";
        String result = CHANGE_BASE.change_base(x, base);
        assertEquals(expected, result);
    }
}