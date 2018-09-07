import java.util.*;

public class BookShelf {

  List<Book> books = new ArrayList<>();

  public void add(Book book) {

    books.add(book);

  }

  public void remove(String book) {

    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).title == book) {
        books.remove(books.get(i));
        return;
      }
    }
  }

  @Override
  public String toString() {

    if (books.size() == 0){
      return "There is no books here.";
    }
    return "You have " +  books.size() + " books." + "\n" + "Earliest released: " + earliest().toString() + "\n" +
        "Latest released: " + latest().toString() +   "\n" + "Favourite author: " + favAuthor();
  }

  public String favAuthor() {

    HashMap<String, Integer> authorMap = new HashMap<String, Integer>();

    for (int i = 0; i < books.size(); i++) {

      Book book = books.get(i); //kiveszek egy konyvet
      String author = book.author; // konyv szerzoje
      Integer count = authorMap.get(author); // kinyerem az author mapbol azt, h hany konyve van a szerzonek
      if (count != null) {
        count++; //novelem a szerzo konyveinek szamat
      } else {
        count = 1;
      }
      authorMap.put(author, count); // visszarakom a mapba a szerzo konyvei szamat

    }
    //kivalasztom a legtobb konyvel rendelkezo szerzot
    int maxCount = 0;//kezdetben nulla a max kony/ szerzo
    String favAuthor = " "; // meg nem tudom, hg ki az
    for (Map.Entry<String, Integer> entry : authorMap.entrySet()) { //vegigmegyek a tablazaton

      String author = entry.getKey(); //megszerzem a szerzot az aktualis sorban
      int count = entry.getValue();//megszerzem a konyvei szamat

      if (count >= maxCount) { //ha a szerzo konyveinek szama nagyobb mint az altalam ismert legmenobb szerzo konyveinek szama
        maxCount = count;//az aktualis legmenobb szerzo konyveinek a szama
        favAuthor = author;//az aktualisan legmenobb szerzo

      }
    }
    return favAuthor;
  }

  public Book earliest() {

    Book earliestBook = null;
    int maxReleaseYear = 10000;
    for (int i = 0; i < books.size(); i++) {
      Book book = books.get(i);
      int releaseYear = book.releaseYear;

      if (releaseYear < maxReleaseYear) {
        maxReleaseYear = releaseYear;
        earliestBook = book;

      }
    }
    return earliestBook;
  }

  public Book latest() {

    Book latestBook = null;
    int maxReleaseYear = 0;
    for (int i = 0; i < books.size(); i++) {
      Book book = books.get(i);
      int releaseYear = book.releaseYear;

      if (releaseYear > maxReleaseYear) {
        maxReleaseYear = releaseYear;
        latestBook = book;

      }
    }
    return latestBook;
  }
}


