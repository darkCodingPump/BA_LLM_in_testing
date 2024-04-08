package CLOSEST_INTEGER;

import org.junit.Test;
import static org.junit.Assert.*;

public class CLOSEST_INTEGERTest {

    @Test
    public void testStandardCase() {
        assertEquals(5, CLOSEST_INTEGER.closest_integer("5.4"));
    }

    @Test
    public void testEdgeCase1() {
        assertEquals(6, CLOSEST_INTEGER.closest_integer("5.6"));
    }

    @Test
    public void testEdgeCase2() {
        assertEquals(0, CLOSEST_INTEGER.closest_integer("0.0"));
    }
}