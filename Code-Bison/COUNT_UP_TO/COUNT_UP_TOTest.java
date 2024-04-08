package COUNT_UP_TO;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class COUNT_UP_TOTest {

    @Test
    public void normal() {
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19), COUNT_UP_TO.count_up_to(20));
    }

    @Test
    public void edgeCase1() {
        assertEquals(List.of(), COUNT_UP_TO.count_up_to(1));
    }

    @Test
    public void edgeCase2() {
        assertEquals(List.of(2, 3), COUNT_UP_TO.count_up_to(5));
    }
}