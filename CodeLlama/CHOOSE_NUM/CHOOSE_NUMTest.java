package CHOOSE_NUM;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CHOOSE_NUMTest {

    @Test
    void test1() {
        int x = 12;
        int y = 15;
        int expected = 14;
        int actual = CHOOSE_NUM.choose_num(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        int x = 13;
        int y = 12;
        int expected = -1;
        int actual = CHOOSE_NUM.choose_num(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        int x = 13;
        int y = 13;
        int expected = -1;
        int actual = CHOOSE_NUM.choose_num(x, y);
        assertEquals(expected, actual);
    }
}