package EXCHANGE;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class EXCHANGETest {

    @Test
    public void normalCase() {
        ArrayList<Integer> lst1 = new ArrayList<>() {{ add(1); add(2); add(3); add(4); }};
        ArrayList<Integer> lst2 = new ArrayList<>() {{ add(1); add(5); add(3); add(4); }};

        assertEquals("NO", EXCHANGE.exchange(lst1, lst2));
    }

    @Test
    public void edgeCase1() {
        ArrayList<Integer> lst1 = new ArrayList<>() {{ add(1); add(2); add(3); add(4); }};
        ArrayList<Integer> lst2 = new ArrayList<>() {{ add(1); add(2); add(3); add(4); }};

        assertEquals("YES", EXCHANGE.exchange(lst1, lst2));
    }

    @Test
    public void edgeCase2() {
        ArrayList<Integer> lst1 = new ArrayList<>() {{ add(2); add(2); }};
        ArrayList<Integer> lst2 = new ArrayList<>() {{ add(1); add(1); add(1); add(1); }};

        assertEquals("YES", EXCHANGE.exchange(lst1, lst2));
    }
}