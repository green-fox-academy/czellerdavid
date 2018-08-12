import java.awt.*;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.MAGENTA);
    bigTriangle(graphics);
  }

  public static void triangle(Graphics graphics, int x, int y) {
    int n = 21;
    int unit = WIDTH  / n;

    graphics.drawLine(x, y, x + unit, y);
    graphics.drawLine(x, y, x + unit / 2, (int) (y - unit * Math.sqrt(3) / 2));
    graphics.drawLine(x + unit, y,x + unit / 2, (int) (y - unit * Math.sqrt(3) / 2) );
  }

  public static void triangleLine(Graphics graphics, int x, int y, int count) {
    int n = 21;
    int unit = WIDTH  / n;

    for (int i = 0; i < count; i++) {
      triangle(graphics, x + unit * i, y);

    }
  }

  public static void bigTriangle(Graphics graphics) {
    int n = 21;
    int unit = WIDTH  / n;
    double height =  unit * Math.sqrt(3) / 2;

    for (int i = 0; i < n; i++ ) {
      int row = n - i;
      triangleLine(graphics, (int) (i * 0.5 * unit), HEIGHT - (int) (height * i), row);
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
