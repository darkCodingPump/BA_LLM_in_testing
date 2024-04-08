package ANTI_SHUFFLE;

import org.junit.Test;
import static org.junit.Assert.*;

public class ANTI_SHUFFLETest {

    @Test
    public void testStandardCase() {
        String input = "Hello World!!!";
        String expected = "!!HeWdlorl";
        String actual = ANTI_SHUFFLE.anti_shuffle(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCase1() {
        String input = "Hi";
        String expected = "Hi";
        String actual = ANTI_SHUFFLE.anti_shuffle(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCase2() {
        String input = "hello";
        String expected = "ehllo";
        String actual = ANTI_SHUFFLE.anti_shuffle(input);
        assertEquals(expected, actual);
    }
}