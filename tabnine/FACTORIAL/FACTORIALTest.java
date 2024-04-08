package FACTORIAL;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FACTORIALTest {

    @Test
    public void testFactorialNormal() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 6, 24, 15));
        List<Integer> actual = FACTORIAL.factorial(5);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorialZero() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = FACTORIAL.factorial(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorialOne() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1));
        List<Integer> actual = FACTORIAL.factorial(1);
        assertEquals(expected, actual);
    }
}