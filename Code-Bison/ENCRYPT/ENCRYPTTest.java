package ENCRYPT;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ENCRYPTTest {

    @Test
    void normalCase() {
        assertEquals("lm", ENCRYPT.encrypt("hi"));
    }

    @Test
    void edgeCase1() {
        assertEquals("ewhjklnop", ENCRYPT.encrypt("asdfghjkl"));
    }

    @Test
    void edgeCase2() {
        assertEquals("kj", ENCRYPT.encrypt("gf"));
    }
}