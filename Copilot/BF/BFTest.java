package BF;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class BFTest {

    // Normal test case
    @Test
    public void test_normal_case() {
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Saturn", "Uranus"));
        ArrayList<String> result = BF.bf("Jupiter", "Neptune");
        assertEquals(expected, result);
    }

    // Edge case: planet1 and planet2 are the same
    @Test
    public void test_same_planet() {
        ArrayList<String> expected = new ArrayList<String>();
        ArrayList<String> result = BF.bf("Earth", "Earth");
        assertEquals(expected, result);
    }

    // Edge case: planet1 and planet2 are not correct planet names
    @Test
    public void test_invalid_planet_names() {
        ArrayList<String> expected = new ArrayList<String>();
        ArrayList<String> result = BF.bf("Mars", "Pluto");
        assertEquals(expected, result);
    }
}