import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void twoDifferentWords() {
    String word1 = "Dave";
    String word2 = "phamed";

    Assert.assertFalse(Anagram.isItAnagramn(word1, word2));

  }

  @Test
  public void twoDifferentWords2() {
    String word1 = "Dave";
    String word2 = "Vade";

    Assert.assertTrue(Anagram.isItAnagramn(word1, word2));
  }

  @Test
  public void twoDifferentWords3() {
    String word1 = "Dave";
    String word2 = "A VED";
    Assert.assertTrue(Anagram.isItAnagramn(word1, word2));
  }


  @Test
  public void twoDifferentWords4() {
    String word1 = "Dave";
    String word2 = "A V";
    Assert.assertFalse(Anagram.isItAnagramn(word1, word2));
  }


  @Test
  public void twoDifferentWords5() {
    String word1 = "Dave";
    String word2 = "E  v  D  A";
    Assert.assertTrue(Anagram.isItAnagramn(word1, word2));
  }
}