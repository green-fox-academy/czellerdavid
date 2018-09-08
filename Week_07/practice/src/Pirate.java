import java.util.Random;

public class Pirate {

  int rumCount = 0;
  boolean dead = false;

  public String drinkSomeRum() {
    Random random = new Random();
    int number = random.nextInt(5) + 1;

    if (dead == true) {
      return "He's dead!";
    }
    rumCount += number;

    return " ";
  }

  public String howIsItGoinMate() {
    if (rumCount <= 4) {

      return "Pour me anudder!";
    }
    rumCount = 0;
    return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
  }

  public String captainStatus() {

    if (rumCount < 4 && dead == false) {
      return "still on his feet and alive!";
    } else if (rumCount == 4 && dead == false) {
      return "passed out, but still alive!";
    }
    return "f**kin' dead mate!";
  }


  public void die() {

    dead = true;
  }


  public int roll() {

    Random random = new Random();
    int number = random.nextInt(3) + 1;
    return number;

  }

  public void brawl(Pirate otherOne) {
    int number = roll();

    if (number == 0) {
      die();
    } else if (number == 1) {
      otherOne.die();
    } else {

      die();
      otherOne.die();
    }
  }

}
