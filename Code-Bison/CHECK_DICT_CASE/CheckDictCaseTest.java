package CHECK_DICT_CASE;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CHECK_DICT_CASE_Test {

    @Test
    void normalCase() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", "banana");
        dict.put("c", "cherry");

        assertTrue(CHECK_DICT_CASE.check_dict_case(dict));
    }
/* 
    @Test
    void emptyDict() {
        HashMap<Object, Object> dict = new HashMap<>();

        assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    } */

    @Test
    void mixedCase() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("A", "banana");
        dict.put("b", "cherry");

        assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test
    void nonStringKey() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", 123);
        dict.put("c", "cherry");

        assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }
}