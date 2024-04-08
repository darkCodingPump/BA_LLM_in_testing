package BF;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class BFTest {

    @Test
    public void normalTest() {
        ArrayList<String> result = BF.bf("Jupiter", "Neptune");
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Saturn", "Uranus"));
        assertEquals(expected, result);
    }

    @Test
    public void edgeCase1() {
        ArrayList<String> result = BF.bf("Earth", "Mercury");
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Venus"));
        assertEquals(expected, result);
    }

    @Test
    public void edgeCase2() {
        ArrayList<String> result = BF.bf("Mercury", "Uranus");
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"));
        assertEquals(expected, result);
    }
}