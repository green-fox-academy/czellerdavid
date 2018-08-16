public class Counter {
  public static void main(String[] args) {
    System.out.println(counter(5));
  }
  public static int counter (int n){

    if (n <= 1){
      return 1;
    }
    else {
      return n + counter(n - 1);
    }
  }
}
