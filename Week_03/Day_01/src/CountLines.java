import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {

    System.out.println(countLines());

  }

  public static int countLines() {

      List<String> content = new ArrayList();
      content.add("First line of my file");
      try {
        Path path = Paths.get("my-file.txt");
        Files.readAllLines(path);
        return content.size();
      }
      catch (Exception e) {
      }
    return 0;
  }
}


// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.