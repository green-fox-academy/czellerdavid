import java.util.ArrayList;
import java.util.Arrays;

public class Replace {
  public static void main(String[] args) {
    ArrayList<String> dishwasher = new ArrayList<String>(Arrays.asList("In a ", "dishwasher ", "far far away"));

    System.out.println(change(dishwasher));
  }

  public static ArrayList<String> change(ArrayList<String> p) {
    String change = "Galaxy ";
        p.set(1, change);
        return p;
  }
}
