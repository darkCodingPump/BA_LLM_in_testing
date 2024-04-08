package EAT;

import org.junit.Test;
import static org.junit.Assert.*;

public class EATTest {

    @Test
    public void testStandardCase() {
        int[] result = EAT.eat(5, 3, 10);
        assertArrayEquals(new int[]{8, 7}, result);
    }

    @Test
    public void testEdgeCase1() {
        int[] result = EAT.eat(5, 15, 10);
        assertArrayEquals(new int[]{15, 0}, result);
    }

    @Test
    public void testEdgeCase2() {
        int[] result = EAT.eat(5, 0, 10);
        assertArrayEquals(new int[]{5, 10}, result);
    }
}