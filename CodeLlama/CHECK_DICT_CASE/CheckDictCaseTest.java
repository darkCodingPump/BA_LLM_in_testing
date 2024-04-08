package CHECK_DICT_CASE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

class CHECK_DICT_CASETest {

    @Test
    void test1() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", "banana");
        boolean expected = true;
        boolean actual = CHECK_DICT_CASE.check_dict_case(dict);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("A", "banana");
        dict.put("B", "banana");
        boolean expected = false;
        boolean actual = CHECK_DICT_CASE.check_dict_case(dict);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put(8, "banana");
        dict.put("a", "apple");
        boolean expected = false;
        boolean actual = CHECK_DICT_CASE.check_dict_case(dict);
        assertEquals(expected, actual);
    }
}