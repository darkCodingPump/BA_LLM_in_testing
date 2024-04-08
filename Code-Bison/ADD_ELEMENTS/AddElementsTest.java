package ADD_ELEMENTS;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class AddElementsTest {

    @Test
    public void normalTest() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(111);
        arr.add(21);
        arr.add(3);
        arr.add(4000);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        int k = 4;

        int expectedResult = 24;
        int actualResult = ADD_ELEMENTS.add_elements(arr, k);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void edgeCase1() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(111);
        arr.add(21);
        arr.add(3);
        arr.add(4000);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        int k = 0;

        int expectedResult = 0;
        int actualResult = ADD_ELEMENTS.add_elements(arr, k);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void edgeCase2() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1111);
        arr.add(-21);
        arr.add(333);
        arr.add(4000);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        int k = 3;

        int expectedResult = 0;
        int actualResult = ADD_ELEMENTS.add_elements(arr, k);

        assertEquals(expectedResult, actualResult);
    }

}