public class FizzBuzz {

  public static void main(String[] args) {

    int count;

    for(count = 1; count <= 100;count++)

     // System.out.print( count+",");
    //System.out.print(100);


    if ((count % 3 == 0) && (count % 5 == 0)) {
      System.out.println("FizzBuzz");
    }
    else if (count % 3 == 0) {
      System.out.println("Fizz");
    }
    else if (count % 5 == 0) {
      System.out.println("Buzz");
    }
    else {
      System.out.println(count);
    }
// can i do this without printing the 100 extra???  <----- this is the question i am needing, can this be done with the first print statement?

  }

}
