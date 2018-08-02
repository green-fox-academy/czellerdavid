import java.util.Scanner;

public class Party {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("How many girs will come to the party? ");

    int userInput1 = scanner.nextInt();

    System.out.println("How many boys will come to the party? ");

    int userInput2 = scanner.nextInt();

    if ((userInput1 + userInput2) >= 20 && (userInput1 == userInput2)) {

    System.out.println("The party is excellent!!!");

    }
    else if (userInput1 == 0)  {

      System.out.println("Sausage party!");

    }
    else if ((userInput1 + userInput2) > 20) {

      System.out.println("Quite cool party!");

    }
    else if ((userInput1 + userInput2) < 20) {

      System.out.println("Avarage Party!");
    }


  }
}