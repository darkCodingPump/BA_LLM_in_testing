package ANTI_SHUFFLE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ANTI_SHUFFLETest {

    @Test
    public void testAntiShuffleStandardCase() {
        String expectedResult = "Hi";
        String result = ANTI_SHUFFLE.anti_shuffle("Hi");
        assertEquals(expectedResult, result);
    }

    @Test
    public void testAntiShuffleEdgeCase1() {
        String expectedResult = "ehllo";
        String result = ANTI_SHUFFLE.anti_shuffle("hello");
        assertEquals(expectedResult, result);
    }

    @Test
    public void testAntiShuffleEdgeCase2() {
        String expectedResult = "Hello !!!Wdlor";
        String result = ANTI_SHUFFLE.anti_shuffle("Hello World!!!");
        assertEquals(expectedResult, result);
    }
}