public class Matrix {
  public static void main(String[] args) {

    int size = 5;
    int[][] matrix = new int[size][size];

    for (int row = 0; row < size; row++){
      for (int col = 0; col < size; col++){
        if (row == col) {
          matrix[row][col] = 1;
        }
        else {
          matrix[row][col] = 0;
        }
      }
    }

    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {

        System.out.print(matrix[row][col]);
      }
      System.out.println();

    }
  }
}
