import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder{
  public static void main(String... args) {

    System.out.println(ifItContains());

  }

  public static String ifItContains(){
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    for (int i = 0; i <arrayList.size() ; i++) {
      int number = arrayList.get(i);
      if(number == 7) {
        return "Hoorray";
      }
    }
    return "Nooooo";
  }
}


//
//    if (number.contains(7)){
//      System.out.println("Horray");
//    }
//    else {
//      System.out.println("Noooooo");
//    }
//System.out.println(containsSeven(arrayList));
// Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
// The output should be: "Noooooo"
// Do this again with a different solution using different list methods!
