package CHANGE_BASE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CHANGE_BASETest {

    @Test
    void test1() {
        int x = 8;
        int base = 3;
        String expected = "22";
        String actual = CHANGE_BASE.change_base(x, base);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        int x = 8;
        int base = 2;
        String expected = "1000";
        String actual = CHANGE_BASE.change_base(x, base);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        int x = 7;
        int base = 2;
        String expected = "111";
        String actual = CHANGE_BASE.change_base(x, base);
        assertEquals(expected, actual);
    }
}