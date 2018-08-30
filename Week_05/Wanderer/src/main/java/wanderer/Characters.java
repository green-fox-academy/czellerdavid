package main.java.wanderer;

import java.util.Random;

public class Characters extends PositionedImage{
  int HP;
  int DP;
  int SP;
  int currentHP;
  int level = 1;
  boolean dead = false;

  int[][] floorMap = {
      {1, 1, 0, 0, 1, 1, 1, 0, 0, 1},
      {1, 1, 0, 0, 1, 1, 1, 0, 1, 1},
      {1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
      {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
      {0, 0, 1, 0, 0, 1, 0, 1, 1, 1},
      {0, 0, 1, 0, 0, 1, 0, 0, 1, 1},
      {1, 1, 1, 0, 0, 1, 0, 0, 0, 1},
      {1, 0, 0, 1, 1, 1, 1, 1, 0, 1},
      {1, 1, 1, 0, 1, 0, 0, 1, 1, 1},
      {1, 0, 0, 0, 0, 0, 0, 1, 0, 1}};

  public Characters(String filename, int posX, int posY) {

    super(filename, posX, posY);
  }

//  Characters(int PosY, int PosX){
//    this.PosX = PosX;
//    this.PosY = PosY;
//  }
//  Characters(){
//
//  }
  public void monsterMove(){


    if ((((int) (Math.random() * 3))) == 0) {
      if (posY != 0 && floorMap[posX][posY - 1] != 0) {
        posY -= 1;
      }
    } else if ((((int) (Math.random() * 3))) == 1) {
      if (posY != 9 && floorMap[posX][posY + 1] != 0) {
        posY += 1;
      }
    } else if ((((int) (Math.random() * 3))) == 2) {
      if (posX != 0 && floorMap[posX -1 ][posY] != 0) {
        posX -= 1;
      }
    } else if ((((int) (Math.random() * 3))) == 3) {
      if (posX != 9 && floorMap[posX + 1][posY] != 0) {
        posX += 1;
      }
    }
  }

 public int dieRoll() {
   return (int) (Math.random() * 6);
 }

  public void battle(Characters otherCharacter) {
    this.strike(otherCharacter);
    otherCharacter.deadYet();
    if (otherCharacter.dead) {
      this.levelUP();

    }
    otherCharacter.strike(this);
    this.deadYet();
  }

  public void strike(Characters otherCharacter) {
    if (this.SP + dieRoll() > otherCharacter.DP) {
      otherCharacter.currentHP -= (this.SP + dieRoll() - otherCharacter.DP);
    }
  }


  public void levelUP() {
    this.HP += dieRoll();
    this.SP += dieRoll();
    this.DP += dieRoll();
  }

  public void deadYet() {
    if (this.currentHP <= 0) {
      this.dead = true;

    }
  }
}
