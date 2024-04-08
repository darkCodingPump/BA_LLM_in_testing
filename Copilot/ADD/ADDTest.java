package ADD;

import org.junit.Test;
import static org.junit.Assert.*;

public class ADDTest {

    // Normal test case
    @Test
    public void test_add_normal_case() {
        int x = 2;
        int y = 3;
        int expected = 5;
        int result = ADD.add(x, y);
        assertEquals(expected, result);
    }

    // Edge case: x = 0, y = 0
    @Test
    public void test_add_zero_values() {
        int x = 0;
        int y = 0;
        int expected = 0;
        int result = ADD.add(x, y);
        assertEquals(expected, result);
    }

    // Edge case: x = -5, y = 5
    @Test
    public void test_add_negative_values() {
        int x = -5;
        int y = 5;
        int expected = 0;
        int result = ADD.add(x, y);
        assertEquals(expected, result);
    }
}