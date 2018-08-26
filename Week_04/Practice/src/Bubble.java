import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bubble {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    Collections.addAll(list, 34, 12, 24, 9, 5);
    Collections.sort(list);


    System.out.println(list);
    list.sort(Collections.reverseOrder());
    System.out.println(list);
  }
}

//  Create a function that takes a list of numbers as parameter
//  Returns a list where the elements are sorted in ascending numerical order
//  Make a second boolean parameter, if it's `true` sort that list descending

//  Example:
//    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
//        //  should print [5, 9, 12, 24, 34]
//System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
//  should print [34, 24, 12, 9, 5]