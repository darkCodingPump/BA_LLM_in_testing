package CHECK_IF_LAST_CHAR_IS_A_LETTER;

import org.junit.Test;
import static org.junit.Assert.*;

public class CHECK_IF_LAST_CHAR_IS_A_LETTERTest {

    // Normal case: The last character is an alphabetical character and not part of a word.
    @Test
    public void test_last_char_alphabetical_not_part_of_word() {
        String txt = "apple pi e";
        boolean result = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(txt);
        assertTrue(result);
    }

    // Edge case: The input string is empty.
    @Test
    public void test_empty_string() {
        String txt = "";
        boolean result = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(txt);
        assertFalse(result);
    }

    // Edge case: The last character is an alphabetical character but part of a word.
    @Test
    public void test_last_char_alphabetical_part_of_word() {
        String txt = "apple pie";
        boolean result = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(txt);
        assertFalse(result);
    }
}