import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    List<String> content = new ArrayList();
    String name = "David Czeller";
    content.add(name);
    try{
      Path path = Paths.get("my-file.txt");
      Files.write(path, content);
      System.out.println(content.get(0));
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}