package ENCODE;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ENCODETest {

    @Test
    void normalTest() {
        assertEquals("tHKS KS C MGSSCGG", ENCODE.encode("This is a message"));
    }

    @Test
    void emptyStringTest() {
        assertEquals("", ENCODE.encode(""));
    }

    @Test
    void specialCharacterTest() {
        assertEquals("!@#$%^&*()", ENCODE.encode("!@#$%^&*()"));
    }
}