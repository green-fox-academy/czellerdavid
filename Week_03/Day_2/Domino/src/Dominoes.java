import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {


    List<Domino> dominoes = initializeDominoes();


    LinkedList<Domino>snake = new LinkedList<Domino>();
    Domino first = dominoes.get(0);
    dominoes.remove(first);
    snake.add(first);


    while(addDomino(dominoes, snake)){

    }
    if(dominoes.isEmpty()){
      System.out.println("Igen fainok vagyunk!");
      System.out.println(snake);
    }
    else {
      System.out.println("Nem vagyunk fainok!");
    }



  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<Domino>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
  //go trough the list and check if it's reversed or not
  public static boolean addDomino(List<Domino> dominos, LinkedList<Domino> snake) {
//go from the front
    int snakeFirst = snake.get(0).isReversed ? snake.get(0).end : snake.get(0).front;
    Domino d = findDomino(snakeFirst, dominos);

    if (d != null) {
      snake.addFirst(d);
      if (d.front == snakeFirst) {
        d.isReversed = true;
      } else {
        d.isReversed = false;
      }
      return true;
    }

    int snakeLast = snake.getLast().isReversed ? snake.getLast().front : snake.getLast().end;
    Domino d2 = findDomino(snakeLast, dominos);

    if (d2 != null) {
      snake.addLast(d2);
      if (d2.end == snakeLast) {
        d2.isReversed = true;
      } else {
        d2.isReversed = false;
      }
      return true;
    }
    return false;
  }


   public static Domino findDomino(int matchingNumber, List<Domino> dominos){

//get the numbers out from the list

    for (int i = 0; i < dominos.size() ; i++) {
        Domino tempDomino = dominos.get(i);
       if(tempDomino.isItAMatch(matchingNumber)){
         dominos.remove(tempDomino);
         return tempDomino;
       }
     }
     return null;
   }
}
