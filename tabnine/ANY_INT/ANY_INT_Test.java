package ANY_INT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ANY_INT_Test {

    @Test
    public void testAnyIntNormal() {
        assertTrue(ANY_INT.any_int(5, 2, 7));
    }

    @Test
    public void testAnyIntEdge1() {
        assertFalse(ANY_INT.any_int(3, 2, 2));
    }

    @Test
    public void testAnyIntEdge2() {
        assertTrue(ANY_INT.any_int(3, -2, 1));
    }
}