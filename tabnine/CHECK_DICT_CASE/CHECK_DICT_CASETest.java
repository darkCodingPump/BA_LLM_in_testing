package CHECK_DICT_CASE;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class CHECK_DICT_CASETest {

    @Test
    public void testStandardCase() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", "banana");
        assertTrue(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test
    public void testMixedCase() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("A", "banana");
        dict.put("B", "banana");
        assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test
    public void testEmptyDict() {
        HashMap<Object, Object> dict = new HashMap<>();
        assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }
}