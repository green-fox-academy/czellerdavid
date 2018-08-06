import java.util.Scanner;

public class Factorio {
  public static void main(String[] args) {
    int number = 10;
    factorio(number);

  }


  public static void factorio(int number) {
    int factorio = 1;
    int i = 1;
    while ( i <= number) {
      factorio = factorio * i;
      i++;
    }
    System.out.println("Factorial of " + number +  " is: " +  factorio);
  }
}

 /* public static void main(String args[]) {
    for (int counter = 0; counter <= 10; counter++) {
      System.out.printf(number(factorial()));
    }
  }
  public static long factorial(long number) {
    if (number <= 1) return 1;
    else return number * factorial(number - 1);*/

 /* public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Put in the numbers: ");
    int numbers = scanner.nextInt();
    System.out.println(factorio(numbers));
  }

  public static int factorio(int lacika) {

    int sum = 0;

    for (int i = 1; i <- lacika; i++) {

      sum *= i;
    }
    return sum;
  }*/