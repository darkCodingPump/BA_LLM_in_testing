package ADD_EVEN_AT_ODD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ADD_EVEN_AT_ODDTest {

    @Test
    void normalCase() {
        int[] lst = {4, 2, 6, 7};
        int expected = 2;
        int actual = ADD_EVEN_AT_ODD.add_even_at_odd(lst);
        assertEquals(expected, actual);
    }

    @Test
    void emptyList() {
        int[] lst = {};
        int expected = 0;
        int actual = ADD_EVEN_AT_ODD.add_even_at_odd(lst);
        assertEquals(expected, actual);
    }

    @Test
    void allOddNumbers() {
        int[] lst = {1, 3, 5, 7};
        int expected = 0;
        int actual = ADD_EVEN_AT_ODD.add_even_at_odd(lst);
        assertEquals(expected, actual);
    }
}