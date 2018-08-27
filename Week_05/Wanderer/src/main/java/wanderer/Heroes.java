package main.java.wanderer;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Heroes {

  int HP, DP, SP;
  int posX, posY;

  public Heroes (int HP, int DP, int SP, int posY, int posX) {


    this.HP = HP;
    this.DP = DP;
    this.SP = SP;
    this.posY = posY;
    this.posX = posX;
  }

//  public void keyReleased(KeyEvent e) {
//    // When the up or down keys hit, we change the position of our box
//    if (e.getKeyCode() == KeyEvent.VK_W) {
//      testBoxY -= 100;
//    } else if (e.getKeyCode() == KeyEvent.VK_S) {
//      testBoxY += 100;
//    } else if (e.getKeyCode() == KeyEvent.VK_D) {
//      testBoxX += 100;
//    } else if (e.getKeyCode() == KeyEvent.VK_A) {
//      testBoxX -= 100;
//    }
//  }
//
//  public void draw(Graphics graphics) {
//    if (image != null) {
//      graphics.drawImage(image, posX, posY, null);
//    }
//  }
}