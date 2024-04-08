package FILE_NAME_CHECK;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FILE_NAME_CHECKTest {

    @Test
    public void testValidFileName() {
        assertEquals("Yes", FILE_NAME_CHECK.file_name_check("example.txt"));
    }

    @Test
    public void testFileNameWithMoreThanThreeDigits() {
        assertEquals("No", FILE_NAME_CHECK.file_name_check("123example.txt"));
    }

    @Test
    public void testFileNameWithoutLatinAlphabetLetter() {
        assertEquals("No", FILE_NAME_CHECK.file_name_check("123.dll"));
    }
}