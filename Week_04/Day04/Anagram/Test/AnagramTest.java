import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram a = new Anagram();

  @Test
  public void testPrintMessage() {
    assertEquals(false, a.isAnagram("Nagy","Arpi"));
  }
}