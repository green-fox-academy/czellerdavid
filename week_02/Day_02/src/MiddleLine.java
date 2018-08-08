import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MiddleLine {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(new Color(255, 15, 47, 255));
    graphics.drawLine(x, y, WIDTH / 2, HEIGHT);

    graphics.setColor(new Color(33, 255, 53, 255));
    graphics.drawLine(0, HEIGHT, WIDTH / 2, HEIGHT);

    //graphics.setColor(new Color(255, 0, 0, 255));
    //graphics.drawLine(0, HEIGHT / 2, WIDTH, HEIGHT / 2);
  }

  // Don't touch the code below
  static int x = 160;
  static int y = 0;
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