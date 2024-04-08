package FACTORIZE;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class FACTORIZETest {

    @Test
    public void normalCase() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(5);
        expected.add(5);
        assertEquals(expected, FACTORIZE.factorize(20));
    }

    @Test
    public void edgeCase1() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(3);
        expected.add(3);
        expected.add(11);
        assertEquals(expected, FACTORIZE.factorize(132));
    }

    @Test
    public void edgeCase2() {
        List<Integer> expected = new ArrayList<>();
        expected.add(37);
        assertEquals(expected, FACTORIZE.factorize(37));
    }
}