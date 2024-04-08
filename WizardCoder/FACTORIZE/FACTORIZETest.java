package FACTORIZE;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FACTORIZETest {

    @Test
    public void testFactorizeStandardCase() {
        int n = 36;
        List<Integer> expected = Arrays.asList(2, 2, 3, 3);
        List<Integer> actual = FACTORIZE.factorize(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorizeEdgeCase1() {
        int n = 1;
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = FACTORIZE.factorize(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorizeEdgeCase2() {
        int n = Integer.MAX_VALUE;
        List<Integer> expected = Arrays.asList(Integer.MAX_VALUE);
        List<Integer> actual = FACTORIZE.factorize(n);
        assertEquals(expected, actual);
    }
}