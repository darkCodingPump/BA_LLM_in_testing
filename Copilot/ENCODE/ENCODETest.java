package ENCODE;

import org.junit.Test;
import static org.junit.Assert.*;

public class ENCODETest {

    // Normal test case
    @Test
    public void test_encode_normal() {
        String message = "test";
        String expected = "TGST";
        String result = ENCODE.encode(message);
        assertEquals(expected, result);
    }

    // Edge case: Empty message
    @Test
    public void test_encode_empty_message() {
        String message = "";
        String expected = "";
        String result = ENCODE.encode(message);
        assertEquals(expected, result);
    }

    // Edge case: Message with only vowels
     @Test
    public void test_encode_only_vowels() {
        String message = "aeiou";
        String expected = "CGKMQ";
        String result = ENCODE.encode(message);
        assertEquals(expected, result);
    } 
}