import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MostProductiveYear {
  public static void main(String[] args) {


    // The name of the file to open.
    String fileName = "paramount.txt";

    // This will reference one line at a time
    String line = null;

    try {
      // FileReader reads text files in the default encoding.
      FileReader fileReader =
          new FileReader(fileName);

      // Always wrap FileReader in BufferedReader.
      BufferedReader bufferedReader =
          new BufferedReader(fileReader);

      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      // Always close files.
      bufferedReader.close();
    } catch (FileNotFoundException ex) {
      System.out.println(
          "Unable to open file '" +
              fileName + "'");
    } catch (IOException ex) {
      System.out.println(
          "Error reading file '"
              + fileName + "'");
      // Or we could just do this:
      // ex.printStackTrace();
    }
  }
}
//    DataBase dataBase = new DataBase();
//    TaskList taskList = dataBase.load();
//    Functions.functions(args, taskList, dataBase);


  //public static void help() {
//    try {
//      Path filePath = Paths.get("paramount.csv", "marvel.cs");
//      List<String> lines = Files.readAllLines(filePath);
//      for (int i = 0; i < lines.size(); i++) {
//        String row = lines.get(i);
//        System.out.println(row);
//      }
//    } catch (Exception e) {
//      System.out.println("Uh-oh, could not read the file!");
//    }
//  }

/**
 * Write a method that helps you find the most productive year for a film studio.
 * The method should take one argument, which is the name of the film studio.
 * The method should try to open the related data file named `studioname`.csv,
 * which is a comma separated file with 3 columns: name of the movie, release year, director
 * <p>
 * - If we do not have any data about the studio, the method should return an error message.
 * - If we have found data, the method should return an information message about the most productive year for that studio.
 * <p>
 * Examples:
 * <p>
 * If we call the method with 'marvel':
 * should return 'marvel has made the most movies in 2017.'
 * <p>
 * If we call the method with 'ghibli':
 * should print 'Cannot find studio, please try again later.'
 * <p>
 * Hint:
 * - You can find some example files in this folder (marvel.csv and paramount.csv)
 * - Most productive year: The year in which the studio has made the most movies.
 */