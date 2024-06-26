package CHECK_DICT_CASE;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;

public class CheckDictCaseTest {


    // Returns True if all keys are strings in lower case
    @Test
    public void test_all_keys_lower_case() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", "banana");
        boolean result = CHECK_DICT_CASE.check_dict_case(dict);
        assertTrue(result);
    }

    // Returns False for a dictionary with multiple key-value pairs and duplicate keys
    @Test
    public void test_duplicate_keys() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("A", "banana");
        dict.put("B", "banana");
        boolean result = CHECK_DICT_CASE.check_dict_case(dict);
        assertFalse(result);
    }

    // Returns False for a dictionary with multiple key-value pairs and keys that differ only in case
    @Test
    public void test_all_keys_mixed_case() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("A", "banana");
        boolean result = CHECK_DICT_CASE.check_dict_case(dict);
        assertFalse(result);
    }
}