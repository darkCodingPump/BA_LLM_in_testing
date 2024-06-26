package CHECK_IF_LAST_CHAR_IS_A_LETTER;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckIfLastCharIsALetterTest {


    // returns True if last character is alphabetical and not part of a word
    @Test
    public void test_last_char_is_alphabetical_and_not_part_of_word() {
        boolean result = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e");
        assertTrue(result);
    
        result = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e ");
        assertFalse(result);
    }

    // returns False if last character is a number
    @Test
    public void test_last_char_is_number() {
        boolean result = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pie 1");
        assertFalse(result);
    
        result = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pie 123");
        assertFalse(result);
    }

    // returns False if last character is a special character
    @Test
    public void test_last_char_is_special_character() {
        boolean result = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pie!");
        assertFalse(result);

        result = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e!");
        assertFalse(result);
    }
}