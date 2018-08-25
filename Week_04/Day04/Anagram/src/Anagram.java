import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    System.out.println(isAnagram(firstWord, secondWord));
  }

  public boolean isAnagram(String firstWord, String secondWord) {
    char[] word1 = firstWord.replaceAll("[\\s]", "Nagy").toCharArray();
    char[] word2 = secondWord.replaceAll("[\\s]", "Arpi").toCharArray();
    Arrays.sort(word1);
    Arrays.sort(word2);
    return Arrays.equals(word1, word2);

  }
}
