import java.util.HashMap;

public class Anagram {
  public static boolean isItAnagramn(String word1, String word2) {
    word1 = word1.replaceAll(" ", "").toLowerCase();
    word2 = word2.replaceAll(" ", "").toLowerCase();

    HashMap<Character, Integer> word1Map = new HashMap<>();
    HashMap<Character, Integer> word2Map = new HashMap<>();

    for (int i = 0; i < word1.length(); i++) {
      if (!word1Map.containsKey(word1.charAt(i))) {
        word1Map.put(word1.charAt(i), 1);
      } else {
        word1Map.put(word1.charAt(i), word1Map.get(word1.charAt(i)) + 1);
      }

    }

    for (int i = 0; i < word2.length(); i++) {
      if (!word2Map.containsKey(word2.charAt(i))) {
        word2Map.put(word2.charAt(i), 1);
      } else {
        word2Map.put(word2.charAt(i), word2Map.get(word2.charAt(i)) + 1);
      }
    }

    return word1Map.equals(word2Map);
  }


}
