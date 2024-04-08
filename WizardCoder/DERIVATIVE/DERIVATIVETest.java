package DERIVATIVE;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DERIVATIVETest {

    @Test
    public void testStandardCase() {
        List<Integer> xs = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(2, 6, 12);
        assertEquals(expected, DERIVATIVE.derivative(xs));
    }

    @Test
    public void testEmptyList() {
        List<Integer> xs = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, DERIVATIVE.derivative(xs));
    }

    @Test
    public void testSingleElementList() {
        List<Integer> xs = Arrays.asList(5);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, DERIVATIVE.derivative(xs));
    }
}