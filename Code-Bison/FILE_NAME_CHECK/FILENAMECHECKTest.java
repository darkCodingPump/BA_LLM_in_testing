package FILE_NAME_CHECK;
import static org.junit.Assert.*;
import org.junit.Test;

public class FILENAMECHECKTest {
    @Test
    public void normalTest() {
        assertEquals("Yes", FILE_NAME_CHECK.file_name_check("example.txt"));
    }

    @Test
    public void edgeCase1() {
        assertEquals("No", FILE_NAME_CHECK.file_name_check("1example.dll")); // name doesn't start with latin alphapet letter
    }

    @Test
    public void edgeCase2() {
        assertEquals("No", FILE_NAME_CHECK.file_name_check(".example.txt")); // extra dot at the beginning of the name
    }
}