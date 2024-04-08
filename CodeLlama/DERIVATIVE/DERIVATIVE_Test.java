package DERIVATIVE;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DERIVATIVE_Test {
@Test
public void testDerivativeNormal() {
    List<Integer> xs = new ArrayList<>(Arrays.asList(3, 1, 2, 4, 5));
    List<Integer> expected = new ArrayList<>(Arrays.asList(1, 4, 12, 20));
    List<Integer> actual = DERIVATIVE.derivative(xs);
    assertEquals(expected, actual);
}

@Test
public void testDerivativeEdge() {
    List<Integer> xs = new ArrayList<>(Arrays.asList(1, 2, 3));
    List<Integer> expected = new ArrayList<>(Arrays.asList(2, 6));
    List<Integer> actual = DERIVATIVE.derivative(xs);
    assertEquals(expected, actual);
}
@Test
public void testDerivativeEdge2() {
    List<Integer> xs = new ArrayList<>();
    List<Integer> expected = new ArrayList<>();
    List<Integer> actual = DERIVATIVE.derivative(xs);
    assertEquals(expected, actual);
}
}