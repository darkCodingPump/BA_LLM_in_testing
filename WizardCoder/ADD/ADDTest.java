package ADD;

import org.junit.Test;
import static org.junit.Assert.*;

public class ADDTest {

    @Test
    public void testAddStandardCase() {
        assertEquals(5, ADD.add(2, 3));
    }

    @Test
    public void testAddEdgeCase1() {
        assertEquals(12, ADD.add(5, 7));
    }

    @Test
    public void testAddEdgeCase2() {
        assertEquals(0, ADD.add(0, 0));
    }
}