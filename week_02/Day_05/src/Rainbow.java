import javax.swing.*;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Rainbow {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.
  int size = 10;
  int position = size;
  Color[] color ={Color.red, Color.orange, Color.yellow, Color.green, Color.blue, (new Color(0, 28, 200)),
      (new Color(238,130,238))};





//
//    for (int  i = 0; i <= 10; i++){
//    graphics.setColor(Color.green);
//     graphics.fillRect(position , position , size, size);
//     position += size;
//
//
//   }
    for (int  i = 0; i < 7; i++) {
      graphics.setColor(color[i]);
      graphics.fillRect(position, position, size, size);
      position += size;
      size += 10;
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
