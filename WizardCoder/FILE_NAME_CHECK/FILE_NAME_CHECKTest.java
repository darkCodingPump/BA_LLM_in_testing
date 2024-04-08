package FILE_NAME_CHECK;

import org.junit.Test;
import static org.junit.Assert.*;

public class FILE_NAME_CHECKTest {

    @Test
    public void testStandardCase() {
        String fileName = "test.txt";
        String expected = "Yes";
        String actual = FILE_NAME_CHECK.file_name_check(fileName);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCase1() {
        String fileName = "12345.txt";
        String expected = "No";
        String actual = FILE_NAME_CHECK.file_name_check(fileName);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCase2() {
        String fileName = "test.jpg";
        String expected = "No";
        String actual = FILE_NAME_CHECK.file_name_check(fileName);
        assertEquals(expected, actual);
    }
}