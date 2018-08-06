import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println( "What do u wanna do? (+, -, *, /, % ) :");
    String operation = scanner.nextLine();
    System.out.println("Gimme two numbers: ");
    int nmb1 = scanner.nextInt();
    int nmb2 = scanner.nextInt();
    //System.out.println( operation + nmb1 + nmb2);

    switch (operation){
      case "+" : System.out.println(nmb1 + nmb2);
        break;
      case "-" : System.out.println(nmb1 - nmb2);
        break;
      case  "/" : System.out.println(nmb1 / nmb2);
        break;
      case "*" : System.out.println(nmb1 * nmb2);
        break;
      case "%" : System.out.println(nmb1 % nmb2);
        break;
      default:
        System.out.println(" U r dumb! ");
        break;
    }
  }
}
