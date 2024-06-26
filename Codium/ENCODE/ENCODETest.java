package ENCODE;


// Generated by CodiumAI

import org.junit.Test;
import static org.junit.Assert.*;

public class ENCODETest {


    // should encode a message with only lowercase letters
    @Test
    public void test_encode_lowercase_letters() {
        String message = "test";
        String expected = "TGST";
        String actual = ENCODE.encode(message);
        assertEquals(expected, actual);
    }

    // should encode a message with the letter 'y'
    @Test
    public void test_encode_message_with_y() {
        String message = "This is a message";
        String expected = "tHKS KS C MGSSCGG";
        String actual = ENCODE.encode(message);
        assertEquals(expected, actual);
    }

    // should encode a message with the letter 'z'
    @Test
    public void test_encode_message_with_z() {
        String message = "This is a message";
        String expected = "tHKS KS C MGSSCGG";
        String actual = ENCODE.encode(message);
        assertEquals(expected, actual);
    }
}