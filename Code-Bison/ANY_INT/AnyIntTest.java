package ANY_INT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnyIntTest {

    @Test
    public void normalCase() {
        assertEquals(true, ANY_INT.any_int(5, 2, 7));
    }

    @Test
    public void edgeCase1_allIntegers() {
        assertEquals(false, ANY_INT.any_int(3, 2, 2));
    }

    @Test
    public void edgeCase2_nonIntegers() {
        assertEquals(false, ANY_INT.any_int(3.6, -2.2, 2));
    }
}