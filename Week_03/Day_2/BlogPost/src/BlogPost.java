public class BlogPost {

  String authorName;
  String title;
  String publicationDate;
  String text;

  public void showPost (){
    System.out.println(title + " titled by " + authorName + " posted at " + publicationDate);
    System.out.println(text);
    System.out.println();
  }
}


