package main.java.wanderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {

  Hero hero;
  Skeleton skeleton;
  Skeleton skeleton2;
  Skeleton skeleton3;
  Boss boss;
  int count = 0;
  int x;

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

  ArrayList<Characters> gameObject = new ArrayList<>();

  public Board() {
    hero = new Hero("down2.png", 0, 0);
    skeleton =new Skeleton("skeleton.png", 7, 7);
    skeleton2 =new Skeleton("skeleton.png",3,3);
    skeleton3 =new Skeleton("skeleton.png",5, 5);
    boss = new Boss("osi.png",9, 9);
    gameObject.add(hero);
    gameObject.add(skeleton);
    gameObject.add(skeleton2);
    gameObject.add(skeleton3);
    gameObject.add(boss);



    // set the size of your draw board
    setPreferredSize(new Dimension(920, 720));
    setVisible(true);
  }

//  public boolean position()  {
//    for (int i = 1; i < gameObject.size(); i++) {
//      if ((gameObject.get(0).posX + 1 == gameObject.get(i).posX && gameObject.get(0).posY == gameObject.get(i).posY + 1)
//          && (gameObject.get(0).posX + 1== gameObject.get(i).posX && gameObject.get(0).posY == gameObject.get(i).posY - 1)
//          && (gameObject.get(0).posX - 1 == gameObject.get(i).posX && gameObject.get(0).posY == gameObject.get(i).posY + 1)
//          && (gameObject.get(0).posX - 1 == gameObject.get(i).posX && gameObject.get(0).posY == gameObject.get(i).posY - 1)) {
//        hero.battle(gameObject.get(i));
//        if (gameObject.get(i).dead) {
//          gameObject.remove(i);
//        }
//        return true;
//      }
//    }
//    return false;
//  }


  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    drawMap(graphics);
    drawStatus(graphics);
    for (int i = 0; i < gameObject.size(); i++) {
      gameObject.get(i).draw(graphics);
    }
//    PositionedImage heroDraw = new PositionedImage(hero.filename, hero.PosX, hero.PosY);
//    heroDraw.draw(graphics);
//    PositionedImage skeleton1Draw = new PositionedImage(skeleton.filename, skeleton.PosX, skeleton.PosY);
//    skeleton1Draw.draw(graphics);
//    PositionedImage skeleton2Draw = new PositionedImage(skeleton2.filename, skeleton2.PosX, skeleton2.PosY);
//    skeleton2Draw.draw(graphics);
//    PositionedImage skeleton3Draw = new PositionedImage(skeleton3.filename, skeleton3.PosX, skeleton3.PosY);
//    skeleton3Draw.draw(graphics);
//    PositionedImage bossDraw = new PositionedImage(boss.filename, boss.PosX, boss.PosY);
//    bossDraw.draw(graphics);
  }
  public void drawStatus(Graphics graphics) {
    graphics.drawRect(730, 10, 180, 700);
    graphics.drawString("GAME STATS", 785, 50);
    graphics.drawString("Dave", 740, 100);
    graphics.drawString("Max HP:  " + hero.HP, 740, 120);
    graphics.drawString("Current HP:  " + hero.currentHP, 740, 140);
    graphics.drawString("DP:  " + hero.DP, 740, 160);
    graphics.drawString("SP:  " + hero.SP, 740, 180);
    if (hero.dead) {
      graphics.drawString("GAME OVER...", 785, 600);

      if (gameObject.get(0).dead) {
        gameObject.remove(0);
      }
    }
    if(boss.dead){
      graphics.drawString("WIN", 920 /2, 720 /2);
    }
    for (int i = 1; i < gameObject.size() ; i++) {
     //if (position() == true) {
      if (gameObject.get(0).posX == gameObject.get(i).posX && gameObject.get(0).posY == gameObject.get(i).posY){
        x=i;
        graphics.drawString("ENEMY STATS:", 740, 300);
        graphics.drawString("Max HP:  " + gameObject.get(i).HP, 740, 350);
        graphics.drawString("Current HP:  " + gameObject.get(i).currentHP, 740, 370);
        graphics.drawString("DP:  " + gameObject.get(i).DP, 740, 390);
        graphics.drawString("SP:  " + gameObject.get(i).SP, 740, 410);
        //hero.battle(gameObject.get(i));
        if (gameObject.get(i).dead) {
          gameObject.remove(i);
        }
      }
    }
}

  public void drawMap(Graphics graphics) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (floorMap[i][j] == 1) {
          PositionedImage image = new PositionedImage("grass.png", i, j);
          image.draw(graphics);
        } else {
          PositionedImage image = new PositionedImage("wall2.png", i, j);
          image.draw(graphics);
        }
      }
    }
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {

    count ++;
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP)  {
      if (hero.posY != 0 && floorMap[hero.posX][hero.posY - 1] != 0 ) {

        hero.posY -= 1;
      }
      hero.changeImage("me-up2.png");
    } else if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (hero.posY != 9 && floorMap[hero.posX][hero.posY + 1] != 0 ) {

        hero.posY += 1;
      }
      hero.changeImage("down2.png");
    } else if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (hero.posX != 9 && floorMap[hero.posX + 1][hero.posY] != 0 ) {

        hero.posX += 1;
      }
      hero.changeImage("right.png");
    } else if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (hero.posX != 0 && floorMap[hero.posX - 1][hero.posY] != 0 ) {

        hero.posX -= 1;
      }
      hero.changeImage("left2.png");
    }else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
        hero.battle(gameObject.get(x));

      hero.changeImage("Punch.png");
      }


    if (count % 2 == 0){
      for (int i = 1; i < gameObject.size() ; i++) {
        gameObject.get(i).monsterMove();
      }
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}