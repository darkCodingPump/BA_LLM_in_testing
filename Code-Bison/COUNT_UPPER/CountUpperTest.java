package COUNT_UPPER;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class COUNT_UPPERTest {

    @Test
    void normalCase1() {
        // Test case 1: Normal case
        String input = "aBCdEf";
        int expectedOutput = 1;
        int actualOutput = COUNT_UPPER.count_upper(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void edgeCase1() {
        // Edge case 1: No uppercase vowels in even indices
        String input = "abcdefg";
        int expectedOutput = 0;
        int actualOutput = COUNT_UPPER.count_upper(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void edgeCase2() {
        // Edge case 2: Empty string
        String input = "";
        int expectedOutput = 0;
        int actualOutput = COUNT_UPPER.count_upper(input);
        assertEquals(expectedOutput, actualOutput);
    }
}