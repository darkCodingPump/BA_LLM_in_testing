package DERIVATIVE;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DERIVATIVETest {

    @Test
    public void testDerivativeNormal() {
        List<Integer> expected = Arrays.asList(1, 4, 12, 20);
        List<Integer> actual = DERIVATIVE.derivative(Arrays.asList(3, 1, 2, 4, 5));
        assertEquals(expected, actual);
    }

    @Test
    public void testDerivativeEdge1() {
        List<Integer> expected = Arrays.asList(2, 6);
        List<Integer> actual = DERIVATIVE.derivative(Arrays.asList(1, 2, 3));
        assertEquals(expected, actual);
    }

    @Test
    public void testDerivativeEdge2() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = DERIVATIVE.derivative(Arrays.asList(3));
        assertEquals(expected, actual);
    }
}