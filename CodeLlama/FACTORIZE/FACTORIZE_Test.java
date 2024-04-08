package FACTORIZE;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FACTORIZE_Test {

@Test
public void testFactorizeNormal() {
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7));
    List<Integer> actual = FACTORIZE.factorize(210);
    assertEquals(expected, actual);
}

@Test
public void testFactorizeZero() {
    List<Integer> expected = new ArrayList<Integer>();
    List<Integer> actual = FACTORIZE.factorize(0);
    assertEquals(expected, actual);
}

@Test
public void testFactorizeOne() {
    List<Integer> expected = new ArrayList<Integer>();
    List<Integer> actual = FACTORIZE.factorize(1);
    assertEquals(expected, actual);
}
}