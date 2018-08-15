import java.util.ArrayList;
import java.util.List;

public class Unique {

  public static void main(String[] args) {

    System.out.println(unique(new int[] {1,11,34,11,52,61,1,34}));

  }
  static List<Integer> unique(int[] listOfNumbers) {
    List<Integer> uniqueNumbers = new ArrayList<Integer>();
    for (int i = 0; i < listOfNumbers.length; i++) {
      if (!uniqueNumbers.contains(listOfNumbers[i])){
        uniqueNumbers.add(listOfNumbers[i]);
      }


    }
    return uniqueNumbers;
  }
}
