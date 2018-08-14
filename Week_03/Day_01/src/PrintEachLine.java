import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    List<String> content = new ArrayList();
    content.add("First line of my file");
   try{
     Path path = Paths.get("assets/my-file.txt");
     Files.write(path, content);
   }catch (Exception e) {
     System.out.println("I couldn't write the file...");
   }
  }
}