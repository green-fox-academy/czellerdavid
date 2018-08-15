import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }

  public static  String ticTacResult (String path){
    List<String> m = loadMatrixFromFile(path);

    if (checkRow(m, 'X')
    && checkColumn(m, 'X')
    && checkAtlo1(m, 'X')
    && checkAtlo2(m, 'X')){
      return "X";
    }

    return "Draw";
  }

  public  static boolean checkRow(List<String> m, char c) {
    for (int i = 0; i < 3; i++){
      if(check(m, i, 0, i, 1, i, 2, c)) {
        return true;
      }
    }
    return false;
  }

  public  static boolean checkColumn(List<String> m, char c) {
    //TODO
    for (int i = 0; i < 3; i++){
      if(check(m, 0, i, 1, i, 2, i, c)) {
        return true;
      }
    }
    return false;
  }

  public static boolean checkAtlo1(List<String> m, char c) {
    return  check(m, 0, 0, 1, 1, 2, 2, c);
  }
  public static boolean checkAtlo2(List<String>m, char c) { return check(m, 2,0, 1,1, 0,2, c);}

  public static boolean check(List<String> m, int x1, int y1, int x2, int y2, int x3, int y3, char c){
    char aa = m.get(x1).charAt(y1);
    char bb = m.get(x2).charAt(y2);
    char cc = m.get(x3).charAt(y3);

    return c == aa && c == bb && c == cc;
  }

  private static List<String> loadMatrixFromFile(String path) {
    try {
      Path pathy = Paths.get(path);
      return Files.readAllLines(pathy);

    }
    catch (Exception e) {
      System.out.println("there is a problem brooo");
    }

    return null;
  }

}

 // public  static boolean anyLineWhat(List<String> m, String what){
//    for (int i = 0; i < 3; i++) {
//      if (nLineWhat(m, i, what)) {
//        return true;
//      }
//    }
//    return false;
//  }
//
//  private static boolean nLineWhat(List<String> m, int n, String what){
//    String firstLine = m.get(n);
//    String triple = what + what + what;
//    return firstLine.equals(triple);
//  }