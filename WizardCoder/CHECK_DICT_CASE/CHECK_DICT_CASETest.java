package CHECK_DICT_CASE;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CHECK_DICT_CASETest {

    @Test
    public void testCheckDictCase() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("key1", "value1");
        dict.put("key2", "value2");
        assertTrue(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test
    public void testCheckDictCaseEmptyDict() {
        HashMap<Object, Object> dict = new HashMap<>();
        assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }

    @Test
    public void testCheckDictCaseMixedCase() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("key1", "value1");
        dict.put("Key2", "value2");
        assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }
}