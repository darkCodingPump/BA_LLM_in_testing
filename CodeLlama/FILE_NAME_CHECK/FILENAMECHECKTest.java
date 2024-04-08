package FILE_NAME_CHECK;

import org.junit.Test;
import static org.junit.Assert.*;

public class FILENAMECHECKTest {

    @Test
    public void testFile_name_check() {
        String file_name = "example.txt";
        String expected = "Yes";
        String actual = FILE_NAME_CHECK.file_name_check(file_name);
        assertEquals(expected, actual);
    }
    @Test
    public void testFile_name_checkWithInvalidName() {
        String file_name = "1example.dll";
        String expected = "No";
        String actual = FILE_NAME_CHECK.file_name_check(file_name);
        assertEquals(expected, actual);
    }

    @Test
    public void testFile_name_checkWithInvalidExtension() {
        String file_name = "example.exe";
        String expected = "No";
        String actual = FILE_NAME_CHECK.file_name_check(file_name);
        assertEquals(expected, actual);
    }
}