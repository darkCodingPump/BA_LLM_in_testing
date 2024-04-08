package EXCHANGE;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class EXCHANGE_Test {

    @Test
    public void testExchangeNormal() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        String expected = "YES";
        String actual = EXCHANGE.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }
    @Test
    public void testExchangeEdge() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 5, 3, 4));
        String expected = "NO";
        String actual = EXCHANGE.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    public void testExchangeEdge2() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
        String expected = "YES";
        String actual = EXCHANGE.exchange(lst1, lst2);
        assertEquals(expected, actual);
    }
}