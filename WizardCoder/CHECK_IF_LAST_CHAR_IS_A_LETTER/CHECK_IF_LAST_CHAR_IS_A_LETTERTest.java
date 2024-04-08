package CHECK_IF_LAST_CHAR_IS_A_LETTER;


import org.junit.Test;
import static org.junit.Assert.*;

public class CHECK_IF_LAST_CHAR_IS_A_LETTERTest {

    @Test
    public void testStandardCase() {
        assertTrue(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Hello World"));
    }

    @Test
    public void testEdgeCase1() {
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("Hello World123"));
    }

    @Test
    public void testEdgeCase2() {
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(""));
    }
}