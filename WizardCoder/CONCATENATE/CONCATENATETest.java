package CONCATENATE;

import org.junit.Test;
import static org.junit.Assert.*;

public class CONCATENATETest {

    @Test
    public void testConcatenateStandardCase() {
        String[] strings = {"Hello", " ", "World"};
        String expected = "Hello World";
        String actual = CONCATENATE.concatenate(strings);
        assertEquals(expected, actual);
    }

    @Test
    public void testConcatenateEmptyArray() {
        String[] strings = {};
        String expected = "";
        String actual = CONCATENATE.concatenate(strings);
        assertEquals(expected, actual);
    }

    @Test
    public void testConcatenateSingleElementArray() {
        String[] strings = {"Hello"};
        String expected = "Hello";
        String actual = CONCATENATE.concatenate(strings);
        assertEquals(expected, actual);
    }
}