import java.util.Scanner;

public class PrintBigger {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please put in a number: ");

    int userInput1 = scanner.nextInt();

    System.out.println("Please put in an other number: ");

    int userInput2 = scanner.nextInt();

    if (userInput1 > userInput2) {
      System.out.println(userInput1 + " is bigger!");
    }
    if (userInput1 < userInput2) {
      System.out.println(userInput2 + " is bigger!");
    }
    if (userInput1 == userInput2) {
      System.out.println("These numbers are equal!");
    }
  }
}
