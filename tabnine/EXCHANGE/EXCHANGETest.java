package EXCHANGE;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EXCHANGETest {

    @Test
    public void testExchangeNormal() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals("YES", EXCHANGE.exchange(lst1, lst2));
    }

    @Test
    public void testExchangeEdge1() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 5, 3, 4));
        assertEquals("NO", EXCHANGE.exchange(lst1, lst2));
    }

    @Test
    public void testExchangeEdge2() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        assertEquals("NO", EXCHANGE.exchange(lst1, lst2));
    }
}