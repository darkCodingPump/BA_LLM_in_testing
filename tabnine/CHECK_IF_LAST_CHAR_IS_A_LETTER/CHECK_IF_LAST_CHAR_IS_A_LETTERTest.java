package CHECK_IF_LAST_CHAR_IS_A_LETTER;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CHECK_IF_LAST_CHAR_IS_A_LETTERTest {

    @Test
    public void testStandardCase() {
        assertTrue(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e"));
    }

    @Test
    public void testEdgeCase1() {
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pie#"));
    }

    @Test
    public void testEdgeCase2() {
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pie"));
    }
}