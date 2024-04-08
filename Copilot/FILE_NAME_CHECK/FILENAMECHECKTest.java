package FILE_NAME_CHECK;

import org.junit.Test;
import static org.junit.Assert.*;

public class FILENAMECHECKTest {

    // Normal case: Valid file name
    @Test
    public void test_valid_file_name() {
        String fileName = "example.txt";
        String result = FILE_NAME_CHECK.file_name_check(fileName);
        assertEquals("Yes", result);
    }

    // Edge case: File name with more than three digits
    @Test
    public void test_file_name_with_more_than_three_digits() {
        String fileName = "12345example.txt";
        String result = FILE_NAME_CHECK.file_name_check(fileName);
        assertEquals("No", result);
    }

    // Edge case: File name with invalid extension
    @Test
    public void test_file_name_with_invalid_extension() {
        String fileName = "example.pdf";
        String result = FILE_NAME_CHECK.file_name_check(fileName);
        assertEquals("No", result);
    }
}