package DECODE_CYCLIC;

import org.junit.Test;
import static org.junit.Assert.*;

public class DECODE_CYCLICTest {

    // Normal test case
     @Test
    public void test_decode_cyclic_normal() {
        String input = "abcde";
        String expectedOutput = "bcdea";
        String actualOutput = DECODE_CYCLIC.decode_cyclic(input);
        assertEquals(expectedOutput, actualOutput);
    } 

    // Edge case: Empty string
    @Test
    public void test_decode_cyclic_empty_string() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = DECODE_CYCLIC.decode_cyclic(input);
        assertEquals(expectedOutput, actualOutput);
    }

    // Edge case: String with length not divisible by 3
     @Test
    public void test_decode_cyclic_length_not_divisible_by_3() {
        String input = "abcd";
        String expectedOutput = "bcda";
        String actualOutput = DECODE_CYCLIC.decode_cyclic(input);
        assertEquals(expectedOutput, actualOutput);
    } 
}