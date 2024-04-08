package ENCRYPT;

import org.junit.Test;
import static org.junit.Assert.*;

public class ENCRYPTTest {

    // Normal test case
    @Test
    public void test_encrypt_normal() {
        String input = "hi";
        String expected = "lm";
        String result = ENCRYPT.encrypt(input);
        assertEquals(expected, result);
    }

    // Edge case: Empty string
    @Test
    public void test_encrypt_empty_string() {
        String input = "";
        String expected = "";
        String result = ENCRYPT.encrypt(input);
        assertEquals(expected, result);
    }

    // Edge case: String with non-alphabetic characters
    @Test
    public void test_encrypt_non_alphabetic() {
        String input = "123!@#";
        String expected = "123!@#";
        String result = ENCRYPT.encrypt(input);
        assertEquals(expected, result);
    }
}