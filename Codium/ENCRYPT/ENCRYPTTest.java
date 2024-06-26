package ENCRYPT;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

public class ENCRYPTTest {


    // encrypt('hi') returns 'lm'
    @Test
    public void test_encrypt_hi() {
        String result = ENCRYPT.encrypt("hi");
        assertEquals("lm", result);
    }

    // encrypt(null) throws NullPointerException
    @Test
    public void test_encrypt_null() {
        assertThrows(NullPointerException.class, () -> {
            ENCRYPT.encrypt(null);
        });
    }

    // encrypt('!@#$%^&*()') returns '!@#$%^&*()'
    @Test
    public void test_encrypt_special_characters() {
        String result = ENCRYPT.encrypt("!@#$%^&*()");
        assertEquals("!@#$%^&*()", result);
    }
}