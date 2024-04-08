package EAT;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

public class EATTest {


    // returns an array with the total number of eaten carrots and the number of carrots left when there are enough remaining carrots
    @Test
    public void test_enough_remaining_carrots() {
        int[] result = EAT.eat(5, 6, 10);
        assertEquals(11, result[0]);
        assertEquals(4, result[1]);
    }

    // returns an array with the total number of eaten carrots and 0 carrots left when there are no remaining carrots and the number of needed carrots is greater than 0
    @Test
    public void test_no_remaining_carrots() {
        int[] result = EAT.eat(4, 8, 9);
        assertEquals(12, result[0]);
        assertEquals(1, result[1]);
    }

    // returns an array with the total number of eaten carrots and the same number of remaining carrots when there are no needed carrots
    @Test
    public void test_behaviour_no_needed_carrots() {
        int[] result = EAT.eat(5, 0, 10);
        assertEquals(5, result[0]);
        assertEquals(10, result[1]);
    }
}