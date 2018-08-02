
import java.util.Scanner;


public class HelloUser {

  public static void main(String[] args) {

      // Creates a scanner
      Scanner scanner = new Scanner(System.in);

      System.out.println("Hello User! Please insert your name here: ");

      // The program stops and waits for user input and to press enter
      String userInput1 = scanner.nextLine();

      // It prints the whole line that was given by the user
      System.out.println("Welcome " + userInput1 + "!" + " How you doing? ");

      // The program stops and waits for user input that is an integer and to press enter
      int userInput2 = scanner.nextInt();

      // It prints the integer
      System.out.println(userInput2);
    }


    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    //System.out.println("Hello, User! " + "  Could you please tell me your name? ");
  }


//Gondolom nem ez a megoldas!