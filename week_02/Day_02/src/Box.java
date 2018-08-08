import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Box {
  public static void mainDraw(Graphics graphics) {

    graphics.drawLine(64, 20, WIDTH / 5, HEIGHT - 40);
    graphics.drawLine(276, 20, 276 , HEIGHT - 40);
    graphics.drawLine(64, 20, 276, 20);
    graphics.drawLine(276, HEIGHT -40, WIDTH / 5, HEIGHT -40);

  }

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