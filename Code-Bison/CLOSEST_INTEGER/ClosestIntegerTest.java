package CLOSEST_INTEGER;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CLOSEST_INTEGERTest {

    @Test
    void normalCase() {
        assertEquals(15, CLOSEST_INTEGER.closest_integer("15.3"));
    }

    @Test
    void edgeCase1() {
        assertEquals(-15, CLOSEST_INTEGER.closest_integer("-14.5"));
    }

    @Test
    void edgeCase2() {
        assertEquals(0, CLOSEST_INTEGER.closest_integer("0.00000"));
    }
}