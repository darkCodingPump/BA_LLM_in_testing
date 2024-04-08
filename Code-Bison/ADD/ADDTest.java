package ADD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ADDTest {

    @Test
    void normalCase() {
        assertEquals(5, ADD.add(2, 3));
    }

    @Test
    void edgeCase1() {
        assertEquals(0, ADD.add(0, 0));
    }

    @Test
    void edgeCase2() {
        assertEquals(-3, ADD.add(2, -5));
    }
}