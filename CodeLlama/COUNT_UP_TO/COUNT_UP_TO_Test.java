package COUNT_UP_TO;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class COUNT_UP_TO_Test {

    @Test
    public void testCountUpToNormal() {
        int n = 5;
        List<Integer> expected = Arrays.asList(2, 3);
        List<Integer> actual = COUNT_UP_TO.count_up_to(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountUpToEdge() {
        int n = 11;
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        List<Integer> actual = COUNT_UP_TO.count_up_to(n);
        assertEquals(expected, actual);
    }

@Test
public void testCountUpToEdge2() {
    int n = 0;
    List<Integer> expected = Collections.emptyList();
    List<Integer> actual = COUNT_UP_TO.count_up_to(n);
    assertEquals(expected, actual);
}
}