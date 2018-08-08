public class Matrix2 {

  public static void main(String[] args) {

    int size = 4;
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
   printMatrix(matrix);
  }

  public static void printLine(int[] line) {

    for (int item:line) {

      System.out.print(item);
    }
    System.out.println();

  }

  public static void printMatrix(int[][] matrix) {

    for (int[] q:matrix){
      printLine(q);

    }

  }

}
