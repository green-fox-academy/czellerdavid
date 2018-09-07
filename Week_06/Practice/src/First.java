public class First {
  public static void main(String[] args) {
    double number1 = 20;
    double number2 = 80;

    double result = (number1 + number2) * 25;
    System.out.println(result);
    double remainder = result % 40;
    System.out.println(remainder);

    if(remainder <= 20){
      System.out.println("total was over the limit");
    }

  }
}
