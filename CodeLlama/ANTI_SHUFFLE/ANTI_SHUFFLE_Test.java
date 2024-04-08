package ANTI_SHUFFLE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ANTI_SHUFFLE_Test {
    @Test
    public void testAntiShuffle() {
        String s = "Hello World!!!";
        String expected = "Hello !!!Wdlor";
        assertEquals(expected, ANTI_SHUFFLE.anti_shuffle(s));
    }

    @Test
    public void testAntiShuffleWithSingleWord() {
        String s = "hello";
        String expected = "ehllo";
        assertEquals(expected, ANTI_SHUFFLE.anti_shuffle(s));
    }

    @Test
    public void testAntiShuffleWithEmptyString() {
        String s = "";
        String expected = "";
        assertEquals(expected, ANTI_SHUFFLE.anti_shuffle(s));
    }
}