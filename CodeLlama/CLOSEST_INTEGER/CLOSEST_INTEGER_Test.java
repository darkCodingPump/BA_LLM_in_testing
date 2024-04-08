package CLOSEST_INTEGER;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CLOSEST_INTEGER_Test {

    @Test
    public void testClosestInteger1() {
        assertEquals(10, CLOSEST_INTEGER.closest_integer("10"));
    }

    @Test
    public void testClosestInteger2() {
        assertEquals(15, CLOSEST_INTEGER.closest_integer("15.3"));
    }

    @Test
    public void testClosestInteger3() {
        assertEquals(15, CLOSEST_INTEGER.closest_integer("14.5"));
        assertEquals(-15, CLOSEST_INTEGER.closest_integer("-14.5"));
    }
}