package FACTORIAL;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class FACTORIALTest {

    @Test
    public void testFactorialStandardCase() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 6, 24, 120));
        assertEquals(expected, FACTORIAL.factorial(5));
    }

    @Test
    public void testFactorialEdgeCase1() {
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, FACTORIAL.factorial(0));
    }

    @Test
    public void testFactorialEdgeCase2() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1));
        assertEquals(expected, FACTORIAL.factorial(1));
    }
}