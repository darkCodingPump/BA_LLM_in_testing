package EXCHANGE;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class EXCHANGETest {


    // Should return "YES" if lst1 contains only even numbers and lst2 contains any numbers
    @Test
    public void test_lst1_only_even_numbers() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(2, 4, 6));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 3, 5));
        String result = EXCHANGE.exchange(lst1, lst2);
        assertEquals("YES", result);
    }

    // Should return "YES" if lst1 contains only one even number and lst2 contains any numbers
    @Test
    public void test_lst1_one_even_number() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(2));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 3, 5));
        String result = EXCHANGE.exchange(lst1, lst2);
        assertEquals("YES", result);
    }

    // Should return "NO" if lst1 contains only one odd number and lst2 contains any numbers
    @Test
    public void test_lst1_contains_one_odd_number_and_lst2_contains_any_numbers() {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 4, 6));
        String result = EXCHANGE.exchange(lst1, lst2);
        assertEquals("NO", result);
    }
}