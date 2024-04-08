package ADD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ADDTest {

    @Test
    public void testAdd() {
        int expected = 5;
        int actual = ADD.add(2, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        int expected = 12;
        int actual = ADD.add(5, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void testAdd3() {
        int expected = 0;
        int actual = ADD.add(0, 0);
        assertEquals(expected, actual);
    }
}