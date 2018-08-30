package main.java.wanderer;


public class Boss extends Characters{
  public Boss(String filename, int posX, int posY) {
    super(filename, posX, posY);


    HP = 2 * level * dieRoll() + dieRoll();
    currentHP = HP;
    DP = level/2 * dieRoll() + dieRoll() / 2;
    SP = level * dieRoll() + level;
  }
}
