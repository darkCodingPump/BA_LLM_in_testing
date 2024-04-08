package EXCHANGE;


import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class EXCHANGETest {

    @Test
    public void testStandardCase() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        assertEquals("YES", EXCHANGE.exchange(lst1, lst2));
    }

    @Test
    public void testEdgeCase1() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        assertEquals("NO", EXCHANGE.exchange(lst1, lst2));
    }

    @Test
    public void testEdgeCase2() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        assertEquals("YES", EXCHANGE.exchange(lst1, lst2));
    }
}