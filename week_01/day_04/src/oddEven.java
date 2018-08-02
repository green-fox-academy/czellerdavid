import java.util.Scanner;

public class oddEven {
  public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);

    System.out.println("Please put in a number: ");


    int userInput1 = scanner.nextInt();

    if (userInput1 == 0) {
      System.out.println("It's a zero!!!");
    }
    else if ((userInput1 & 1) == 0) {
     // else if ((userInput1 % 2) == 0){
      System.out.println("Even");
      }
      else {
      System.out.println("Odd");
    }


  }
}
