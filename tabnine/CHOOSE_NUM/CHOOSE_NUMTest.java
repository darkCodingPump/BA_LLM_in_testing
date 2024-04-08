package CHOOSE_NUM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CHOOSE_NUMTest {

    @Test
    public void testStandardCase() {
        assertEquals(14, CHOOSE_NUM.choose_num(12, 15));
    }

    @Test
    public void testEdgeCase1() {
        assertEquals(-1, CHOOSE_NUM.choose_num(13, 12));
    }

    @Test
    public void testEdgeCase2() {
        assertEquals(10, CHOOSE_NUM.choose_num(10, 11));
    }
}