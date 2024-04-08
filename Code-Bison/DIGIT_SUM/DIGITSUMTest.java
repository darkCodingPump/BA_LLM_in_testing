package DIGIT_SUM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DIGIT_SUMTests {

    @Test
    void normal_case() {
        assertEquals(131, DIGIT_SUM.digit_sum("abAB"));
    }

    @Test
    void empty_string() {
        assertEquals(0, DIGIT_SUM.digit_sum(""));
    }

    @Test
    void no_upper_case() {
        assertEquals(0, DIGIT_SUM.digit_sum("abc"));
    }
}