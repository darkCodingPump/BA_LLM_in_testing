package ADD_ELEMENTS;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class ADD_ELEMENTS_Test {

    @Test
    public void testAddElements() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(111,21,3,4000,5,6,7,8,9));
        int k = 4;
        int expected = 24;
        int actual = ADD_ELEMENTS.add_elements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddElementsEdgeCase1() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(111,21,3,4000,5,6,7,8,9));
        int k = 1;
        int expected = 11;
        int actual = ADD_ELEMENTS.add_elements(arr, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddElementsEdgeCase2() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(111,21,3,4000,5,6,7,8,9));
        int k = 9;
        int expected = 111;
        int actual = ADD_ELEMENTS.add_elements(arr, k);
        assertEquals(expected, actual);
    }
}