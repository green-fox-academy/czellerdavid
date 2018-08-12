import java.awt.*;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Envelope {

  public static void topLeft(Graphics graphics) {
    int n = 10;
    int unit = 16;
    for (int i = 1; i < n; i++){
      graphics.drawLine(WIDTH / 2, (n - i) * unit , i * unit,HEIGHT / 2 );
    }
  }

  public static void topRight(Graphics graphics) {
    int n = 10;
    int unit = 16;
    for (int i = 1; i < n; i++){
      graphics.drawLine(WIDTH  / 2, i * unit , i * unit + WIDTH / 2,HEIGHT / 2 );
    }
  }

  public static void buttomLeft(Graphics graphics) {
    int n = 10;
    int unit = 16;
    for (int i = 1; i < n; i++){
      graphics.drawLine(WIDTH / 2, HEIGHT / 2 + i * unit, i * unit ,HEIGHT / 2 );
    }
  }

  public static void buttomRight(Graphics graphics) {
    int n = 10;
    int unit = 16;
    for (int i = 1; i < n; i++){
      graphics.drawLine(WIDTH / 2 + (n - i) * unit, HEIGHT / 2, WIDTH / 2 ,HEIGHT / 2 + i * unit);
    }
  }




  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.MAGENTA);
    topLeft(graphics);
    topRight(graphics);
    buttomLeft(graphics);
    buttomRight(graphics);
  }


  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
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
