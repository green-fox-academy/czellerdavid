package academy.greenfox.seconds;

public class Seconds {
  public static void main(String[] args) {
    int[] original = {1, 2, 3, 4, 5};

    for (int i = 0; i < original.length; i++) {
      System.out.println(original[i += 1]);
    }
  }
    // Create a function that takes a list as a parameter,
    // and returns a new list with every second element from the orignal list
    // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result
}

