package CONCATENATE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CONCATENATETest {

    @Test
    public void testConcatenateStandardCase() {
        String[] input = {"Hello", " ", "World"};
        String expectedResult = "Hello World";
        String actualResult = CONCATENATE.concatenate(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testConcatenateEmptyArrayCase() {
        String[] input = {};
        String expectedResult = "";
        String actualResult = CONCATENATE.concatenate(input);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testConcatenateNullArrayCase() {
        String[] input = null;
        String expectedResult = "";
        String actualResult = CONCATENATE.concatenate(input);
        assertEquals(expectedResult, actualResult);
    }
}