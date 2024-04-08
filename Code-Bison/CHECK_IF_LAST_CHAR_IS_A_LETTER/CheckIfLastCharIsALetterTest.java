
package CHECK_IF_LAST_CHAR_IS_A_LETTER;

 
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CHECK_IF_LAST_CHAR_IS_A_LETTERTest {

    @Test
    void normalCase() {
        assertEquals(true, CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pie"));
    }

    @Test
    void edgeCase1() {
        assertEquals(false, CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(""));
    }

    @Test
    void edgeCase2() {
        assertEquals(true, CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e"));
    }
}