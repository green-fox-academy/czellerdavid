public class Reverse {
  public static void main(String[] args)
  {
    String input = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    StringBuilder input1 = new StringBuilder();

    // append a string into StringBuilder input1
    input1.append(input);

    // reverse StringBuilder input1
    input1 = input1.reverse();

    // print reversed String
    System.out.println(input1);
  }
}
