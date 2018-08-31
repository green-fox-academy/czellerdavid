import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
    //String csvFile = "/Users/dave/greenfox/czellerdavid/Week_05/cucc/src/paramount.csv";

public class MostProductiveYear {
  public static void main(String[] args) {
    System.out.println(mostProductiveYear("marvel"));
    System.out.println(mostProductiveYear("paramount"));
    System.out.println(mostProductiveYear("ghibli"));
  }

  public static String mostProductiveYear(String studioName) {
    String shoutThis;
    List<String> lines  = new ArrayList<>();
    Map<String, Integer> yearCount = new HashMap<>();
    String mostProductiveYear = "";
    if (studioName.equals("marvel") || studioName.equals("paramount")) {
      try {
        Path filePath = Paths.get("src/" + studioName + ".csv");
        lines = Files.readAllLines(filePath);
      } catch (Exception e) {
        System.out.println("sorry, the file is not found or not readable");
      }
      for (int i = 0; i < lines.size(); i++) {
        String yearToCheck = lines.get(i).split(",")[1];
        if (!yearCount.containsKey(yearToCheck)) {
          yearCount.put(yearToCheck, 1);
        } else {
          Integer temp = yearCount.get(yearToCheck);
          yearCount.put(yearToCheck, temp + 1);
        }
      }
      int value = 0;
      for (String key : yearCount.keySet()) {
        if (yearCount.get(key) > value ) {
          mostProductiveYear = key;
          value = yearCount.get(key);
        }
      }
      shoutThis = studioName + " has made the most movies in ";
      shoutThis = shoutThis + mostProductiveYear;
    } else {
      shoutThis = "cannot find studio, please try again later.";
    }
    return shoutThis;
  }
}
//public class MostProductiveYear {
//  public static void main(String[] args) {
//
//    BufferedReader br = null;
//    String line = "";
//    String cvsSplitBy = ",";
//
//    try {
//
//      br = new BufferedReader(new FileReader(csvFile));
//      while ((line = br.readLine()) != null) {
//
//        // use comma as separator
//        String[] lines = line.split(cvsSplitBy);
//
//
//          String years = lines[1];
//
//
//        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
//
//        /*Adding elements to HashMap*/
//        hmap.put("Years", Integer.valueOf(years));
//
//        int sum = 0;
//        for (int i = 0; i < hmap.size(); i++) {
//
//        }
//        System.out.println();
//
//      }
//
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    } finally {
//      if (br != null) {
//        try {
//          br.close();
//        } catch (IOException e) {
//          e.printStackTrace();
//        }
//      }
//    }
//
//  }
//
//}

/**
 * Write a method that helps you find the most productive year for a film studio.
 * The method should take one argument, which is the name of the film studio.
 * The method should try to open the related data file named `studioname`.csv,
 * which is a comma separated file with 3 columns: name of the movie, release year, director
 *
 *  - If we do not have any data about the studio, the method should return an error message.
 *  - If we have found data, the method should return an information message about the most productive year for that studio.
 *
 * Examples:
 *
 * If we call the method with 'marvel':
 * should return 'marvel has made the most movies in 2017.'
 *
 * If we call the method with 'ghibli':
 * should print 'Cannot find studio, please try again later.'
 *
 * Hint:
 *  - You can find some example files in this folder (marvel.csv and paramount.csv)
 *  - Most productive year: The year in which the studio has made the most movies.
 */