
import java.util.Scanner;


public class AnimalsAndLegs {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Hello Old Mc'Donald! Please insert how many chickens you have:  ");

    // The program stops and waits for user input and to press enter
    int userInput1 = scanner.nextInt();

    // It prints the whole line that was given by the user
    //System.out.println(userInput1);

    System.out.println("Please tell me now, how many pigs you have: ");

    // The program stops and waits for user input that is an integer and to press enter
    int userInput2 = scanner.nextInt();
    //new StringBuilder().append(userInput1).append(userInput2).toString();

   // int inputs = userInput1 + userInput2;

    System.out.println("So u got this many animals: ");
    System.out.println(userInput1 + userInput2) ;

    int legs = ((userInput1 * 2) + (userInput2 * 4));
    System.out.println("So that many legs walking around your farm: " + legs);



    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
  }
}
