package ANY_INT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ANY_INT_Test {
    @Test
    public void testAnyInt() {
        double x = 5;
        double y = 2;
        double z = 7;
        assertEquals(true, ANY_INT.any_int(x, y, z));
    }

    @Test
    public void testAnyIntWithNonIntegerInput() {
        double x = 3.6;
        double y = -2.2;
        double z = 2;
        assertEquals(false, ANY_INT.any_int(x, y, z));
    }

    @Test
    public void testAnyIntWithNoMatchingSum() {
        double x = 3;
        double y = 2;
        double z = 2;
        assertEquals(false, ANY_INT.any_int(x, y, z));
    }
}