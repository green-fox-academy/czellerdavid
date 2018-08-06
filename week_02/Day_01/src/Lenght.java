public class Lenght {
  public static void main(String[] args) {
    int[] p1 = {1, 2, 3};
    int[] p2 = {4, 5,5, 5};

    if (p1.length > p2.length) {
      System.out.println("p1 longer! ");
    }

    if (p2.length > p1.length) {
      System.out.println("p2 is longer! ");
    }

    if (p1.length == p2.length) {
      System.out.println("Equal! ");
    }
  }

}
