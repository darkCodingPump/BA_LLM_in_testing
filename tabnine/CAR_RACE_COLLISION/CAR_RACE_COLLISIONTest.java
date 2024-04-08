package CAR_RACE_COLLISION;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CAR_RACE_COLLISIONTest {

    @Test
    public void testStandardCase() {
        int n = 3;
        int expectedResult = 9;
        assertEquals(expectedResult, CAR_RACE_COLLISION.car_race_collision(n));
    }

    @Test
    public void testZeroCase() {
        int n = 0;
        int expectedResult = 0;
        assertEquals(expectedResult, CAR_RACE_COLLISION.car_race_collision(n));
    }

    @Test
    public void testNegativeCase() {
        int n = -3;
        int expectedResult = 9;
        assertEquals(expectedResult, CAR_RACE_COLLISION.car_race_collision(n));
    }
}