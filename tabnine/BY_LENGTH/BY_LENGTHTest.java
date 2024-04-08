package BY_LENGTH;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class BY_LENGTHTest {

    @Test
    public void testByLength() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(1);
        input.add(1);
        input.add(4);
        input.add(5);
        input.add(8);
        input.add(2);
        input.add(3);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Two");
        expected.add("One");
        expected.add("One");
        expected.add("Four");
        expected.add("Five");
        expected.add("Eight");
        expected.add("Two");
        expected.add("Three");

        ArrayList<String> result = BY_LENGTH.by_length(input);

        assertEquals(expected, result);
    }

    @Test
    public void testByLengthEmptyArray() {
        ArrayList<Integer> input = new ArrayList<>();

        ArrayList<String> expected = new ArrayList<>();

        ArrayList<String> result = BY_LENGTH.by_length(input);

        assertEquals(expected, result);
    }

    @Test
    public void testByLengthStrangeNumbers() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(-1);
        input.add(55);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("One");

        ArrayList<String> result = BY_LENGTH.by_length(input);

        assertEquals(expected, result);
    }
}