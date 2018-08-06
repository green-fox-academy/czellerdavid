public class Params {

  // A method that takes variable number of integer arguments.

  static void fun(int ...a)
  {
    System.out.println("Number of arguments: " + a.length);

    // using for each loop to display contents of a
    for (int i: a)
      System.out.print(i + " faszom, ");
    System.out.println();
  }

  // Driver code
  public static void main(String args[])
  {
    // Calling the varargs method with different number
    // of parameters
    fun(100);         // one parameter
    fun(1, 2, 3, 4);  // four parameters
    fun();            // no parameter
  }


}

/* public static void main(String[] args) {
    String[] number = {"a", "b", "c", "d" };

    System.out.println(number);

    for (int i = 0; i < number.length; i++) {
      System.out.println(number[i] + " ");
    }

  }*/
