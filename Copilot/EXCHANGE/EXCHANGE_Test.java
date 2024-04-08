package EXCHANGE;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class EXCHANGE_Test {

    // Normal test case
    @Test
    public void test_exchange_normal() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        String result = EXCHANGE.exchange(lst1, lst2);
        assertEquals("YES", result);
    }

    // Edge case: lst1 and lst2 are empty
    @Test
    public void test_exchange_empty_lists() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        String result = EXCHANGE.exchange(lst1, lst2);
        assertEquals("YES", result);
    }

    // Edge case: lst1 contains only odd numbers
    @Test
    public void test_exchange_odd_numbers() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        String result = EXCHANGE.exchange(lst1, lst2);
        assertEquals("NO", result);
    } 
}