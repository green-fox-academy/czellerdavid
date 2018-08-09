import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquarePositioning {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    // avoid code duplication.
    int x = 320 / 2;
    int y = 343 / 2;

    for (int i = 30, j = 30; i <= 50; i += 30, j = 30) {
      //for (int v = x - 10, w = y -10; v <= 50; v += 10, w = 10) {
        graphics.setColor(Color.green);
        graphics.drawRect(x, y, i, j);
        graphics.drawRect(x - 30, y - 30, i, j);
        graphics.drawRect(x - 60, y - 60, i, j);
        graphics.drawRect(x + 30, y + 30, i, j);
        graphics.drawRect(x + 60, y +60, i, j);

      //}
    }

    //    Don't touch the code below

  }
    static int WIDTH = 320;
    static int HEIGHT = 343;


    public static void main (String[]args){
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

