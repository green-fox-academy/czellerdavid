import java.util.Scanner;
import java.lang.ArithmeticException;

public class DivideByZero {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please gimme a number: ");

    try {
      int number = 10 / scanner.nextInt();
      System.out.println(number);
    }catch (ArithmeticException e){
      System.out.println("fail");
    }
  }
}
//
//if (number == 0){
//    System.out.println("fail");
//    }
//    else{
//    System.out.println(number);
//    }
