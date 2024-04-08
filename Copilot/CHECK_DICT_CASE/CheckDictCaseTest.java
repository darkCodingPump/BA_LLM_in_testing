package CHECK_DICT_CASE;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;

public class CheckDictCaseTest {

    // Normal case: All keys are strings in lower case
    @Test
    public void test_all_lower_case() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", "banana");
        boolean result = CHECK_DICT_CASE.check_dict_case(dict);
        assertTrue(result);
    }

    // Edge case: All keys are strings in upper case
    @Test
    public void test_all_upper_case() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("A", "apple");
        dict.put("B", "banana");
        boolean result = CHECK_DICT_CASE.check_dict_case(dict);
        assertTrue(result);
    }

    // Edge case: Mixed case keys
    @Test
    public void test_mixed_case() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("A", "banana");
        dict.put("B", "banana");
        boolean result = CHECK_DICT_CASE.check_dict_case(dict);
        assertFalse(result);
    }
}