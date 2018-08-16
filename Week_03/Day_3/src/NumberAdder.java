public class NumberAdder {

  public static void main(String[] args) {

    System.out.println(counter(5));

  }

  //  public static int counter(int n){
//
//    if (n <= 1){
//      return 1;
//    }
//    else{
//
//      return counter(n - 1 ) + n;
//    }// }
  public static int counter(int n) {

    if (n == 1) {
      return 1;
    }
    return n + counter(n - 1);
  }
}
