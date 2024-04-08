package DECODE_CYCLIC;

import org.junit.Test;

import static org.junit.Assert.*;

public class DECODE_CYCLIC_TESTS {

    @Test
    public void normalTest() {
        assertEquals("HAL", DECODE_CYCLIC.decode_cyclic("LAH"));
    }

    @Test
    public void emptyStringTest() {
        assertEquals("", DECODE_CYCLIC.decode_cyclic(""));
    }

    @Test
    public void singleCharacterStringTest() {
        assertEquals("A", DECODE_CYCLIC.decode_cyclic("A"));
    }
}