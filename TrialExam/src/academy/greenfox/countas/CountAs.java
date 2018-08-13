package academy.greenfox.countas;

import java.util.*;
public class CountAs {
  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word: ");
  String operation = scanner.nextLine();
  String firstLetter = "a" + "A";

    if (0 <= firstLetter.indexOf(operation.charAt(0))){
      System.out.println(1);
    }
    else {
      System.out.println(0);
    }
  }
}

