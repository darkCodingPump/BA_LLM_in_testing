package CAR_RACE_COLLISION;

import org.junit.Test;
import static org.junit.Assert.*;

public class CAR_RACE_COLLISIONTest {

    @Test
    public void testCarRaceCollisionStandardCase() {
        assertEquals(16, CAR_RACE_COLLISION.car_race_collision(4));
    }

    @Test
    public void testCarRaceCollisionEdgeCase1() {
        assertEquals(0, CAR_RACE_COLLISION.car_race_collision(0));
    }

    @Test
    public void testCarRaceCollisionEdgeCase2() {
        assertEquals(1, CAR_RACE_COLLISION.car_race_collision(1));
    }
}