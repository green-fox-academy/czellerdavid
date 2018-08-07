import java.util.ArrayList;
import java.util.Arrays;

public class TakesLonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It "; //+ "you expect, even when you take into account Hofstadter's Law.";
    String quote2 = "you expect, even when you take into account Hofstadter's Law.";
    String plus = "always takes longer than ";
    String quote3 = "Hofstadter’s Law: It you expect, even when you take into account Hofstadter’s Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)
    System.out.println(quote3.substring(0,quote3.indexOf("you")) + "always takes longer than" + (quote2.substring(quote2.indexOf("you"))));
    System.out.println(quote + plus + quote2);

    //System.out.println(appendA(quote));
  }
  /*public static ArrayList<String> appendA(ArrayList<String> p) {
    String change = "always takes longer than ";
    p.add(1, change);
    return p;
    }*/
}
