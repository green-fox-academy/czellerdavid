public class Diagonal {
  public static void main(String[] args) {

    int size = 50;

    String[][] matrix = new String [size][size];

    for (int row = 0; row < size; row++){
      for (int col = 0; col < size; col++){
        if (row == col) {
          matrix[row][col] = "%";
        }
        else if (row == 0 || row == size - 1 || col == 0 || col == size - 1){
          matrix[row][col] = "%";
        }
        else {
          matrix[row][col] = " ";
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

