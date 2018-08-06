

  public class CodingHours {

    public static void main(String[] args) {
      // An average Green Fox attendee codes 6 hours daily
      // The semester is 17 weeks long
      //
      // Print how many hours is spent with coding in a semester by an attendee,
      // if the attendee only codes on workdays.
      //
      // Print the percentage of the coding hours in the semester if the average
      // work hours weekly is 52

        int hrs = 6;
        int weeks = 17;
        int weekdays = 17 * 5;
        int semester = (17 * 7);
        int weeklyhrs = 52;

      System.out.println();


        System.out.println("U spend " + weekdays * hrs + "hours with coding usually.");
        System.out.println("U r coding average " + (weekdays + hrs) % weeklyhrs + " hrs during the semester, weekly.");

    }

  }

