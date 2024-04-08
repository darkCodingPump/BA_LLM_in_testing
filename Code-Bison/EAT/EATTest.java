package EAT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EATTest {

    @Test
    void normalCase() {
        int[] result = EAT.eat(10, 3, 6);
        assertArrayEquals(new int[]{13, 3}, result);
    }

    @Test
    void edgeCase1() {
        int[] result = EAT.eat(10, 7, 2);
        assertArrayEquals(new int[]{17, 0}, result);
    }

    @Test
    void edgeCase2() {
        int[] result = EAT.eat(10, 0, 10);
        assertArrayEquals(new int[]{10, 10}, result);
    }
}