package main.java.wanderer;

public class Hero extends Characters{



   public Hero(String filename, int posX, int posY) {
      super(filename, posX, posY);


    HP = 10 + 3 * dieRoll();
    currentHP = HP;
    DP = 2 * dieRoll();
    SP = 5 + dieRoll();

  }
}
