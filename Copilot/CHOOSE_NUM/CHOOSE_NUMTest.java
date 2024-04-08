package CHOOSE_NUM;

import org.junit.Test;
import static org.junit.Assert.*;

public class CHOOSE_NUMTest {

    // Normal case: x = 12, y = 15
    @Test
    public void test_normal_case() {
        int x = 12;
        int y = 15;
        int result = CHOOSE_NUM.choose_num(x, y);
        assertEquals(14, result);
    }

    // Edge case: x = 13, y = 12
    @Test
    public void test_edge_case_1() {
        int x = 13;
        int y = 12;
        int result = CHOOSE_NUM.choose_num(x, y);
        assertEquals(-1, result);
    }

    // Edge case: x = 10, y = 10
     @Test
    public void test_edge_case_2() {
        int x = 10;
        int y = 10;
        int result = CHOOSE_NUM.choose_num(x, y);
        assertEquals(-1, result);
    } 
}