package BF;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class BFTest {

    @Test
    public void testBF1() {
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("Saturn", "Uranus"));
        ArrayList<String> actualResult = BF.bf("Jupiter", "Neptune");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBF2() {
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("Venus"));
        ArrayList<String> actualResult = BF.bf("Earth", "Mercury");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBF3() {
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"));
        ArrayList<String> actualResult = BF.bf("Mercury", "Uranus");
        assertEquals(expectedResult, actualResult);
    }
}