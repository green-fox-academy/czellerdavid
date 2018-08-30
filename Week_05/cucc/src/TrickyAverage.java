public class TrickyAverage {
  public static void main(String[] args) {

    int[] number = {5, 2, 8, -1};
    System.out.println(getTrickyAvg(number));
  }

public static double getTrickyAvg(int[] number){
    double avg = (double)( maxAndEven(number) + minAndOdd(number)) / 2;

  return avg;
}

  public static int maxAndEven(int[] number) {

    int maxAndEven = number[0];
    for (int i = 0; i < number.length; i++) {
      if (number[i] > maxAndEven && number[i] % 2 == 0) {
        maxAndEven = number[i];
      }
    }
    return maxAndEven;
  }
  public static int minAndOdd(int[] number){

    int minAndOdd = number[0];
    for (int i = 0; i < number.length; i++) {
      if (number[i] < minAndOdd && number[i] % 2 != 0) {
        minAndOdd = number[i];
      }
    }
    return minAndOdd;
  }
}

/**
 * Create and test a function called `getTrickyAvg` that takes a number array (only integers) as parameter
 * and returns the average of the smallest odd and largest even.
 *  - use only basic control flow statements, like 'for', 'if', etc.
 *  - do not use built-in methods like 'filter', 'forEach', 'map', etc.
 *  - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)
 *
 * Example cases:
 * [1, 2, 3] -> should return 1.5
 * [3, 4, 5, 6] -> should return 4.5
 * [5, 2, 8, -1] -> should return 3.5
 */