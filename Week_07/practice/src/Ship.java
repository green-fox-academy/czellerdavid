import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  List<Pirate> pirates = new ArrayList<>();
  Captain captain;

  String name;

  public  Ship(String name){
    this.name = name;
  }

  public void addCaptain(Captain captain) {

    this.captain = captain;

  }


  public void add(Pirate pirate) {

    pirates.add(pirate);

  }

  public void remove() {

    for (int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i).dead == true) {
        pirates.remove(pirates.get(i));

      }
    }
  }

  public void fillShip() {

    Random random = new Random();
    int number = random.nextInt(10) + 1;


    addCaptain(new Captain("Jack Sparrow"));

    for (int i = 0; i < number; i++) {

      add(new Pirate());

    }
  }
  public void lose(){

    Random random = new Random();
    int number = random.nextInt(pirates.size()) + 1;

    for (int i = 0; i < number; i++) {

      pirates.get(i).die();

    }
    System.out.println("Lose " + name);
  }

  public void win(){

    int count = alivePirates();
    Random random = new Random();
    int number = random.nextInt(count) + 1;
    captain.drinkSomeRum();

    for (int i = 0; i < number; i++) {

      pirates.get(i).drinkSomeRum();

    }
    System.out.println("Win " + name);
    //megirni rendesen
  }

  public int alivePirates() {
    int count = 0;

    for (Pirate pirate : pirates) {

      if (pirate.dead == false) {
        count++;
      }
    }
    return count;
  }

  public int calculatedScore() {

    int score = alivePirates() - captain.rumCount;

    return score;
  }

  public boolean battle(Ship otherOne) {

    if (this.calculatedScore() > otherOne.calculatedScore()) {
      otherOne.lose();
      this.win();
      return true;
    }
    otherOne.win();
    this.lose();
    return false;
  }

  @Override
  public String toString() {

    String result = " ";

    result += "Number of alive pirates in the crew is : " + alivePirates();

    return captain + result;
  }
}
