import java.util.List;

public class GetIndex {


  public static int getIndex(int i, List<Integer> listOfNumbers) {

    if (!listOfNumbers.isEmpty()) {
      for (int j = 0; j < listOfNumbers.size(); j++) {
        if (listOfNumbers.get(j) == i) {
          return j;
        }
      }
      return -1;
    }
    return -1;
  }
}
