package academy.greenfox.seconds;

public class Seconds {
  public static void main(String[] args) {
    int[] original = {1, 2, 3, 4, 5};

    for (int i = 1; i < original.length; i += 2) {
      System.out.println(original[i]);
    }
  }
}

