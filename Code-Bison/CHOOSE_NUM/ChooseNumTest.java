package CHOOSE_NUM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CHOOSE_NUMTest {

    @Test
    void normalTest() {
        assertEquals(14, CHOOSE_NUM.choose_num(12, 15));
    }

    @Test
    void edgeCase1() {
        assertEquals(-1, CHOOSE_NUM.choose_num(13, 12));
    }

    @Test
    void edgeCase2() {
        assertEquals(10, CHOOSE_NUM.choose_num(10, 10));
    }
}