package CONCATENATE;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CONCATENATETest {

    @Test
    void concatenateEmptyArray() {
        String[] strings = {};
        String expectedResult = "";
        String actualResult = CONCATENATE.concatenate(strings);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void concatenateSingleElementArray() {
        String[] strings = {"Hello"};
        String expectedResult = "Hello";
        String actualResult = CONCATENATE.concatenate(strings);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void concatenateMultipleElementsArray() {
        String[] strings = {"Hello", " ", "World"};
        String expectedResult = "Hello World";
        String actualResult = CONCATENATE.concatenate(strings);
        assertEquals(expectedResult, actualResult);
    }
}