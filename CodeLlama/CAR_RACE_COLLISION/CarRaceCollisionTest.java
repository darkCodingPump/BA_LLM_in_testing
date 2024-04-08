package CAR_RACE_COLLISION;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CAR_RACE_COLLISIONTest {

    @Test
    void test1() {
        int n = 5;
        int expected = 25;
        int actual = CAR_RACE_COLLISION.car_race_collision(n);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        int n = 10;
        int expected = 100;
        int actual = CAR_RACE_COLLISION.car_race_collision(n);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        int n = 20;
        int expected = 400;
        int actual = CAR_RACE_COLLISION.car_race_collision(n);
        assertEquals(expected, actual);
    }
}