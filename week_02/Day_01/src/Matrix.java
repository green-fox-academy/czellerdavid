public class Matrix {
  public static void main(String[] args) {

    int[][] matrix = new int[4][4];

    for (int row = 0; row < 4; row++){
      for (int col = 0; col < 4; col++){
        if (row == col) {
          matrix[row][col] = 1;
        }
        else {
          matrix[row][col] = 0;
        }
      }
    }

    for (int row = 0; row < 4; row++) {
      for (int col = 0; col < 4; col++) {

        System.out.print(matrix[row][col]);
      }
      System.out.println();

    }
  }
}
