//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UrlFixer {
  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    //String urlb = "https//www.reddit.com/r/nevertellmethebots";
    //String http = "https://";

    //String cucc1 = ("https//" , "bots");
    //String cucc2 = "https://" + "odds";
    //String urlRiht = url.replaceAll("https//www.reddit.com/r/nevertellmethe", "odds");

    //ArrayList<String> http = new ArrayList<String>(Arrays.asList("https", "//www.reddit.com/r/nevertellmethebots"));


    //"https//www.reddit.com/r/nevertellmethe", "bots";


    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!


    System.out.println(url.replaceAll("bots", "odds"));
    System.out.println(url.replaceAll("https//", "https://"));

   // System.out.println(url.replaceAll("https//", "http://")  (url.replaceAll("bots", "odds")));
    //System.out.println(url.replaceAll(cucc1, cucc2));

    //System.out.println(url.replaceAll( "https//" + "bots", "http://" + "odds"));

    //System.out.println(change(urlb));


  }

  public static ArrayList<String> change(ArrayList<String> p) {
    String change = "https:";
    p.set(0, change);

    return p;



  }

}
