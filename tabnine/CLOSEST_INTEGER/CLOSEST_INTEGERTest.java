package CLOSEST_INTEGER;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CLOSEST_INTEGERTest {

    @Test
    public void testStandardCase() {
        assertEquals(10, CLOSEST_INTEGER.closest_integer("10.0"));
    }

    @Test
    public void testEdgeCase1() {
        assertEquals(15, CLOSEST_INTEGER.closest_integer("15.5"));
    }

    @Test
    public void testEdgeCase2() {
        assertEquals(-15, CLOSEST_INTEGER.closest_integer("-15.5"));
    }
}