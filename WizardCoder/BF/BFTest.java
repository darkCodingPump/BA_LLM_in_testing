package BF;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class BFTest {

    @Test
    public void testStandardCase() {
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Earth"));
        assertEquals(expected, BF.bf("Mercury", "Earth"));
    }

    @Test
    public void testEdgeCase1() {
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Earth", "Mars", "Jupiter", "Saturn", "Uranus"));
        assertEquals(expected, BF.bf("Earth", "Neptune"));
    }

    @Test
    public void testEdgeCase2() {
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, BF.bf("Pluto", "Earth"));
    }
}