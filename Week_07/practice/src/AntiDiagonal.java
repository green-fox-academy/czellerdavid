
public class AntiDiagonal {

  public static void main(String[] args) {

    int[][] numbers = {{1, 2, 3}, {3, 4, 6}, {5, 2, 5}};
    int[][] numbers2 = {{3, 5, 11, -2}, {3, 1, 7, 4}, {5, 0, 2, 9}, {21, 7, 8, 2}};
    System.out.println(getAntiDiagonalAvg(numbers));
    System.out.println(getAntiDiagonalAvg2(numbers2));


  }

  static double getAntiDiagonalAvg(int[][] numbers) {

    Double sum = 0.0;
    double avg = 0;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        if ((numbers.length - 1 - i) == j) {
          sum += (double) numbers[i][j];

          avg = sum / (numbers.length);
        }
      }
    }
    return avg;
  }
  static double getAntiDiagonalAvg2(int[][] numbers2) {

    Double sum = 0.0;
    double avg2 = 0;
    for (int i = 0; i < numbers2.length; i++) {
      for (int j = 0; j < numbers2[i].length; j++) {
        if ((numbers2.length - 1 - i) == j) {
          sum += (double) numbers2[i][j];

          avg2 = sum / (numbers2.length);
        }
      }
    }
    return avg2;
  }
}

/**
 * Create and test a method called `getAntiDiagonalAvg` that takes a multidimensional array (only integers)
 * which represents a square matrix, as a parameter and returns the average of the numbers in the anti diagonal.
 * - write test for 2 different scenarios
 * <p>
 * Example cases:
 * [
 * [1, 2, 3],
 * [3, 4, 6],
 * [5, 2, 5]
 * ]
 * Should return 4, because (3 + 4 + 5) / 3 = 4.
 * <p>
 * [
 * [3, 5, 11, -2],
 * [3, 1, 7, 4],
 * [5, 0, 2, 9],
 * [21, 7, 8, 2]
 * ]
 * Should return 6.5, because (-2 + 7 + 0 + 21) / 4 = 6.5.
 */