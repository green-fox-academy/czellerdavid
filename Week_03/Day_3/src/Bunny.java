public class Bunny {
  public static void main(String[] args) {

    System.out.println(bunny(1));
  }
  public static int bunny(int n){

    if (n == 0){
      return 0;
    }
    return 2 + bunny(n - 1);
  }
}

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).