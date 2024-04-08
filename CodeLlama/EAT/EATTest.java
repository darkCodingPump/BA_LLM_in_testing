package EAT;

import org.junit.Test;
import static org.junit.Assert.*;

public class EATTest {

    @Test
    public void testEatNormal() {
        int[] expected = {11, 4};
        int[] actual = EAT.eat(5, 6, 10);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEatEdge1() {
        int[] expected = {12, 1};
        int[] actual = EAT.eat(4, 8, 9);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEatEdge2() {
        int[] expected = {7, 0};
        int[] actual = EAT.eat(2, 11, 5);
        assertArrayEquals(expected, actual);
    }
}