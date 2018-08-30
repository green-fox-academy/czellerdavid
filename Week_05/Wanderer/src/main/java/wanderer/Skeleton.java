package main.java.wanderer;



public class Skeleton extends Characters{


  public Skeleton(String filename, int posX, int posY) {
    super(filename, posX, posY);
    HP =  2 * level * dieRoll();
    currentHP = HP;
    DP = level/2 * dieRoll();
    SP = level * dieRoll();
  }
}

