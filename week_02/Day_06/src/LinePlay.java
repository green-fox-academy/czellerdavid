import java.awt.*;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.MAGENTA);
    int n = 13;
    int unit = WIDTH / n;

    for (int i = 2; i < n; i++) {
      graphics.drawLine(i * unit, 0, WIDTH, (i - 2) * unit);
    }
    graphics.setColor(Color.green);
    for (int i = 2; i < n; i++) {
      graphics.drawLine(0, i * unit, (i - 2) * unit,  WIDTH);
    }
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
