package main.java.wanderer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {



  BufferedImage image;
  int posX, posY;
  String filename;
  int tileSize = 72;

  public PositionedImage(String filename, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;

    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX * tileSize, posY * tileSize, null);
    }

  }
  public void changeImage(String filename){
    this.filename = filename;
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}