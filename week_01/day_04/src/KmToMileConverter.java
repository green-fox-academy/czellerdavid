
import java.util.Scanner;
import java.lang.String;




public class KmToMileConverter {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Hello User! Please insert your numbers here in Km: ");

    // The program stops and waits for user input and to press enter
    double userInput1 = scanner.nextDouble();

    // It prints the whole line that was given by the user
    //System.out.println(userInput1);

    // The program stops and waits for user input that is an integer and to press enter
   // double userInput2 = scanner.nextDouble();


    // It prints the integer
    System.out.println(userInput1 + " km is : " + userInput1 * 1.68 + " mile");// Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
  }
}
