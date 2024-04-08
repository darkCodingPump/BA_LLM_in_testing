package CONCATENATE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CONCATENATE_Test {

    @Test
    public void testConcatenate1() {
        String[] strings = {"Hello", "World"};
        String expected = "HelloWorld";
        assertEquals(expected, CONCATENATE.concatenate(strings));
    }

    @Test
    public void testConcatenate2() {
        String[] strings = {"123", "456", "789"};
        String expected = "123456789";
        assertEquals(expected, CONCATENATE.concatenate(strings));
    }

    @Test
    public void testConcatenate3() {
        String[] strings = {"a", "b", "c"};
        String expected = "abc";
        assertEquals(expected, CONCATENATE.concatenate(strings));
    }
}