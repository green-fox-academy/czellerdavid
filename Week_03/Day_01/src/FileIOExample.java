import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class FileIOExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a file name:");
    String filename = scanner.nextLine();
    Path path = Paths.get(filename);
    // old one before java 8
    File file = new File(filename);

    List<String> lines = null;

    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    for (String line : lines) {
      System.out.println(line);
    }
  }
}
