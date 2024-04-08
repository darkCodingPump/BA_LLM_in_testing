package FACTORIAL;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class FACTORIALTest {

    @Test
    public void normalTest() {
        assertEquals(FACTORIAL.factorial(5), new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(6);
            add(24);
            add(15);
        }});
    }

    @Test
    public void edgeCase1() {
        assertEquals(FACTORIAL.factorial(1), new ArrayList<Integer>() {{
            add(1);
        }});
    }

    @Test
    public void edgeCase2() {
        assertEquals(FACTORIAL.factorial(10), new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(6);
            add(24);
            add(120);
            add(720);
            add(5040);
            add(40320);
            add(362880);
            add(3628800);
        }});
    }
}