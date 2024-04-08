package ANTI_SHUFFLE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AntiShuffleTest {

  @Test
  public void normalInput() {
    String input = "Hello World!!!";
    String expected = "Hello !!!Wdlor";
    assertEquals(expected, ANTI_SHUFFLE.anti_shuffle(input));
  }

  @Test
  public void emptyString() {
    String input = "";
    String expected = "";
    assertEquals(expected, ANTI_SHUFFLE.anti_shuffle(input));
  }

  @Test
  public void singleWord() {
    String input = "Mississippi";
    String expected = "iiimppssssst";
    assertEquals(expected, ANTI_SHUFFLE.anti_shuffle(input));
  }
}