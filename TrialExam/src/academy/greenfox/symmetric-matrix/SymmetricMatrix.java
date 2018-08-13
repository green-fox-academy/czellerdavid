package academy.greenfox.symmetricmatrix;

import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricMatrix {

  //  public static int[] symmetricMatrix {
//
//  int[] n = symmetricMatrix;
//
//  int[][] a = new int[n][n];
//
//    for (int i = 0; i < a.length; i++) {
//    for (int j = 0; j < a.length; j++) {
//      a[i][j] = (i + 1) * (j + 1);
//    }
//  }
//
//    for (int[] is : a) {
//    System.out.println(Arrays.toString(is));
//  }
  public static void main(String[] args) {

    int size = 3;
    int size2 = 3;
    int[][] matrix = new int[size][size];

    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        if (row == col) {
          matrix[row][col] = 1;
        } else {
          matrix[row][col] = 0;
        }
      }
    }

    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {


//        System.out.print(matrix[row][col]);
      }
      if (size != size2) {
        System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
      } else {
        boolean symmetric = true;

        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size2; j++) {
            if (matrix[i][j] != matrix[j][i]) {
              symmetric = false;
              break;
            }
          }
        }

        if (symmetric) {
          System.out.println("The given matrix is symmetric...");
        } else {
          System.out.println("The given matrix is not symmetric...");
        }

        System.out.println();

      }
      // Create a function named `isSymmetric` that takes an n×n integer matrix (list of lists) as parameter
      // and returns true, if is that matrix is symmetric (diagonally from top-left to bottom-right)
      // or false if it is not
      //
      // example for symmetric matrix:
      // 1 0 1
      // 0 2 2
      // 1 2 5
      //
      // example for not symmetric matrix
      // 7 7 7
      // 6 5 7
      // 1 2 1

      ArrayList<ArrayList<Integer>> symmetricMatrix = new ArrayList<ArrayList<Integer>>();

      symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1)));
      symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(0, 2, 2)));
      symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 2, 5)));

//      System.out.println(isSymmetric(symmetricMatrix)); // should print out true
//    }
//
//    private static Object isSymmetric (ArrayList < ArrayList < Integer >> symmetricMatrix) {
//      return null;

    }
  }
}