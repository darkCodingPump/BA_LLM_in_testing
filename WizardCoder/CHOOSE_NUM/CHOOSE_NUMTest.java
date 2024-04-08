package CHOOSE_NUM;
import org.junit.Test;
import static org.junit.Assert.*;

public class CHOOSE_NUMTest {

    @Test
    public void testChoose_num_StandardCase() {
        assertEquals(-1, CHOOSE_NUM.choose_num(5, 4));
    }

    @Test
    public void testChoose_num_EdgeCase1() {
        assertEquals(-1, CHOOSE_NUM.choose_num(5, 5));
    }

    @Test
    public void testChoose_num_EdgeCase2() {
        assertEquals(6, CHOOSE_NUM.choose_num(5, 7));
    }
}