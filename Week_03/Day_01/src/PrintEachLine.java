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



// Write a program that opens a file called "my-file.txt", then prints
// each of the lines form the file.
// If the program is unable to read the file (for example it does not exists),
// then it should print an error message like: "Unable to read file: my-file.txt"