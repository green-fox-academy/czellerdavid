
public class BattleApp {
  public static void main(String[] args) {

    Ship myShip = new Ship("Ship1");
    Ship myShip2 = new Ship("Ship2");
    myShip.fillShip();
    myShip2.fillShip();
    myShip.battle(myShip2);

    System.out.println(myShip.toString());

  }
}
