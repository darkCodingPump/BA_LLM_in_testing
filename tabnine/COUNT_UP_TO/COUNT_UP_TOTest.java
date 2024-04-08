package COUNT_UP_TO;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class COUNT_UP_TOTest {

    @Test
    public void testCountUpTo_StandardCase() {
        List<Integer> expectedResult = List.of(2, 3, 5, 7, 11, 13, 17, 19);
        List<Integer> actualResult = COUNT_UP_TO.count_up_to(20);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountUpTo_EdgeCase1() {
        List<Integer> expectedResult = List.of();
        List<Integer> actualResult = COUNT_UP_TO.count_up_to(0);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountUpTo_EdgeCase2() {
        List<Integer> expectedResult = List.of(2, 3, 5, 7, 11, 13, 17);
        List<Integer> actualResult = COUNT_UP_TO.count_up_to(18);
        assertEquals(expectedResult, actualResult);
    }
}