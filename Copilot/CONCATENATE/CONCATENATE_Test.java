package CONCATENATE;

import org.junit.Test;
import static org.junit.Assert.*;

public class CONCATENATE_Test {

    // Normal case: Concatenating an array of strings
    @Test
    public void test_concatenate_normal() {
        String[] strings = {"Hello", ", ", "World!"};
        String expected = "Hello, World!";
        String result = CONCATENATE.concatenate(strings);
        assertEquals(expected, result);
    }

    // Edge case: Concatenating an empty array of strings
    @Test
    public void test_concatenate_empty() {
        String[] strings = {};
        String expected = "";
        String result = CONCATENATE.concatenate(strings);
        assertEquals(expected, result);
    }

    // Edge case: Concatenating an array with a null string
    @Test
    public void test_concatenate_null() {
        String[] strings = {"Hello", null, "World!"};
        String expected = "HelloWorld!";
        String result = CONCATENATE.concatenate(strings);
        assertEquals(expected, result);
    } 
}