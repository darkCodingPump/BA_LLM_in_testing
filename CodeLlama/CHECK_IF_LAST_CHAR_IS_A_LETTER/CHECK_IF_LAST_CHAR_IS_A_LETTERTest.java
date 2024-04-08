package CHECK_IF_LAST_CHAR_IS_A_LETTER;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CHECK_IF_LAST_CHAR_IS_A_LETTERTest {

    @Test
    public void testCheckIfLastCharIsALetter1() {
        boolean expected = false;
        boolean actual = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pie");
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckIfLastCharIsALetter2() {
        boolean expected = true;
        boolean actual = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e");
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckIfLastCharIsALetter3() {
        boolean expected = false;
        boolean actual = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e ");
        assertEquals(expected, actual);
    }

/*     @Test
    public void testCheckIfLastCharIsALetter4() {
        boolean expected = false;
        boolean actual = CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("");
        assertEquals(expected, actual);
    } */
}