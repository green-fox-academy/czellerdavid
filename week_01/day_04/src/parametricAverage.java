import java.util.Scanner;


public class parametricAverage {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("How many numbers you got? ");


    double howManyTimes = scanner.nextInt();
    double sum = 0;

    for (int i = 0; i < howManyTimes; i++) {

      double nmb1;

      System.out.print("Put ur " + (i + 1) + " number: ");

      nmb1 = scanner.nextInt();
      sum = sum + nmb1;

    }
    double average = sum / howManyTimes;

    System.out.println("This is the sum of ur numbers: " + sum);
    System.out.println("This is the average of ur numbers: " + average);

  }
}




/*
      System.out.println("Enter ur 2nd number: ");

      nmb2 = scanner.nextInt();

      sum

      System.out.println("Enter ur 3rd number: ");

      nmb3 = scanner.nextInt();

      Answer = nmb1 + nmb2 + nmb3;
      System.out.println(" Ur answeer is: " + Answer);
      */







   /* System.out.println("How many numbers you got? ");


    int howManyTimes = scanner.nextInt();

    for (int i = 0; i < howManyTimes; i++) {
      System.out.println((i + 1) + ". Please put in a number: ");

      int userInput = scanner.nextInt();
}
*/