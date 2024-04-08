package COUNT_UP_TO;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class COUNT_UP_TO_Test {

    @Test
    public void testCountUpTo() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        assertEquals(expected, COUNT_UP_TO.count_up_to(10));
    }

    @Test
    public void testCountUpToEdgeCase1() {
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, COUNT_UP_TO.count_up_to(2));
    }

    @Test
    public void testCountUpToEdgeCase2() {
        List<Integer> expected = Arrays.asList(2);
        assertEquals(expected, COUNT_UP_TO.count_up_to(3));
    }
}