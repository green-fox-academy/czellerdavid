import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Put in the numbers: ");
    int numbers = scanner.nextInt();
    System.out.println(factorio(numbers));
  }

  public static int factorio(int lacika) {

    int sum = 0;

      for (int i = 1; i <= lacika; i++) {

        sum += i;
    }
    return sum;
  }

}
/*for (int i = 1; i < numbers; i++) {
    //System.out.println(i + 1);

    sum = sum + i;
      }

    System.out.println(sum);*/