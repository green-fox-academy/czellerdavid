

public class SecondsInADay {

  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int secInOneDay = 86400;

    int hrsInSec = (currentHours * 3600);
    int minInSec = (currentMinutes * 60);

    int currentSec = (hrsInSec + minInSec + currentSeconds);


    System.out.println(secInOneDay - currentSec);



    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
  }
}
