package FACTORIZE;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FACTORIZETest {

    @Test
    public void testFactorizeNormal() {
        List<Integer> expected = Arrays.asList(1, 3, 5);
        List<Integer> actual = FACTORIZE.factorize(30);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorizeEdge1() {
        List<Integer> expected = Arrays.asList(2, 3, 7);
        List<Integer> actual = FACTORIZE.factorize(42);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorizeEdge2() {
        List<Integer> expected = Arrays.asList(2);
        List<Integer> actual = FACTORIZE.factorize(2);
        assertEquals(expected, actual);
    }
}