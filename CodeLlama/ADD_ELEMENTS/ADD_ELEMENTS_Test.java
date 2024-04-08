package ADD_ELEMENTS;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ADD_ELEMENTS_Test {
    @Test
    public void testAddElements() {
       ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(111, 21, 3, 4000, 5, 6, 7, 8, 9));
    
       int k = 4;
    
       int expected = 24;
    
       assertEquals(expected, ADD_ELEMENTS.add_elements(arr, k));
    
    }
    @Test
    public void testAddElementsWithNegativeElements() {
       ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-111, 21, -3, 4000, 5, 6, 7, 8, 9));
    
       int k = 4;
    
       int expected = 18;
    
       assertEquals(expected, ADD_ELEMENTS.add_elements(arr, k));
    
    }
    @Test
    public void testAddElementsWithAllElementsHavingTwoDigits() {
       ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99));
    
       int k = 4;
    
       int expected = 66;
    
       assertEquals(expected, ADD_ELEMENTS.add_elements(arr, k));
    
    }
    }