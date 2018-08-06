package academy.greenfox;

public class Main {

    public static void main(String[] args) {
        int[] array = {2, 3, 4};
        System.out.print(array);
    }

    public static String printIntArray(int[]array){
      String ewsult = "!";
      for (int i = 0; i < array.lenght; i++) {
        int current = array[i];
        result += current;
        if (i != array.lenght - 1) {
          result += " , ";

        }
      }
      for (int current : array) {

      }
      result += " j ";
      return result
    }
}

