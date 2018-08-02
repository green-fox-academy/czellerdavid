import java.util.Scanner;

public class OneTwoALot {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please put in a number: ");


    int userInput1 = scanner.nextInt();

    if (userInput1 <= 0) {
      System.out.println("Not enough!");
    }
    if ( userInput1 == 1) {
      // else if ((userInput1 % 2) == 0){
      System.out.println("One");
    }
    if (userInput1 == 2){
      System.out.println("Two");
    }
    if (userInput1  > 2)
      System.out.println("A lot!");
    }


  }




