package CAR_RACE_COLLISION;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarRaceCollisionTest {

    @Test
    public void testNormalCase() {
        int n = 3;
        int expected = 9;
        int actual = CAR_RACE_COLLISION.car_race_collision(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCase1() {
        int n = 0;
        int expected = 0;
        int actual = CAR_RACE_COLLISION.car_race_collision(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCase2() {
        int n = 1;
        int expected = 1;
        int actual = CAR_RACE_COLLISION.car_race_collision(n);
        assertEquals(expected, actual);
    }
}