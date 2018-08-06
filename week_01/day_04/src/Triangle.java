import java.util.Scanner;

public class Triangle {

  public static void main(String[] args) {


    System.out.println("Put in a number: ");
    for (int i=0; i<=10; i++) {
      for (int j=0; j<=i; j++)
        System.out.print("*");
    }
    Scanner scanner = new Scanner(System.in);

    int userInput1 = scanner.nextInt();

  }
}
