package CAR_RACE_COLLISION;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarRaceCollisionTest {

    // Normal case: Test with a positive number of cars
    @Test
    public void testCarRaceCollision_NormalCase() {
        int n = 5;
        int expectedCollisions = 25; // n * n
        int actualCollisions = CAR_RACE_COLLISION.car_race_collision(n);
        assertEquals(expectedCollisions, actualCollisions);
    }

    // Edge case: Test with zero cars
    @Test
    public void testCarRaceCollision_ZeroCars() {
        int n = 0;
        int expectedCollisions = 0;
        int actualCollisions = CAR_RACE_COLLISION.car_race_collision(n);
        assertEquals(expectedCollisions, actualCollisions);
    }

    // Edge case: Test with negative number of cars
    @Test
    public void testCarRaceCollision_NegativeCars() {
        int n = -5;
        int expectedCollisions = 25; // n * n
        int actualCollisions = CAR_RACE_COLLISION.car_race_collision(n);
        assertEquals(expectedCollisions, actualCollisions);
    }
}