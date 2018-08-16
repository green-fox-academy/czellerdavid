public class Power {
  public static void main(String[] args) {

    System.out.println(count(3));
  }
  public static int count(int n){
    if(n == 0){
      return 0;
    }

    return ((count(n-1) + (2*n)-1));
  }
}
// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).