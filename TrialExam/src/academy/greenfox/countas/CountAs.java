package academy.greenfox.countas;

import java.util.*;
public class CountAs {
  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word: ");
  String operation = scanner.nextLine();
  String firstLetter = "a";

  long l=System.nanoTime();
    firstLetter = String.valueOf(operation.charAt(0));
    System.out.println("1");



    // Create a function that takes a string parameter,
    // counts the occurances of the letter "a", and returns it as a number.

    // example: on the input "Apple" the function should return 1 - print this result
    // example: on the input "Blueberry" the function should return 0 - print this result
  }
}
