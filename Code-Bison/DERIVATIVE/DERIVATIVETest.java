package DERIVATIVE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class DERIVATIVETest {

    @Test
    public void normalTest() {
        // Test a normal case.
        List<Integer> xs = new ArrayList<>();
        xs.add(3);
        xs.add(1);
        xs.add(2);
        xs.add(4);
        xs.add(5);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);
        expected.add(12);
        expected.add(20);

        assertEquals(expected, DERIVATIVE.derivative(xs));
    }

    @Test
    public void edgeCase1() {
        // Test an empty list.
        List<Integer> xs = new ArrayList<>();
        assertEquals(new ArrayList<>(), DERIVATIVE.derivative(xs));
    }

    @Test
    public void edgeCase2() {
        // Test a list with only one element.
        List<Integer> xs = new ArrayList<>();
        xs.add(1);
        assertEquals(new ArrayList<>(), DERIVATIVE.derivative(xs));
    }
}