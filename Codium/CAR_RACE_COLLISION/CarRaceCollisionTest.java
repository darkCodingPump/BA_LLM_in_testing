package CAR_RACE_COLLISION;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

public class CarRaceCollisionTest {


    // The function returns the expected number of collisions when n is a positive integer.
    @Test
    public void test_positive_integer_collision() {
        int n = 5;
        int expectedCollisions = n * n;
        int actualCollisions = CAR_RACE_COLLISION.car_race_collision(n);
        assertEquals(expectedCollisions, actualCollisions);
    }

    // The function returns an error when n is negative.
    @Test
    public void test_negative_integer_collision() {
        int n = -5;
        try {
            CAR_RACE_COLLISION.car_race_collision(n);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("n must be a positive integer", e.getMessage());
        }
    }

    // The function can handle large values of n (e.g. n=1000).
    @Test
    public void test_large_value_of_n() {
        int n = 1000;
        int expectedCollisions = n * n;
        int actualCollisions = CAR_RACE_COLLISION.car_race_collision(n);
        assertEquals(expectedCollisions, actualCollisions);
    }
}