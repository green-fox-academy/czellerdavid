package main.java.wanderer;

import java.awt.event.KeyEvent;

public class Hero extends Heroes {

  Hero() {
    super(20 + (int) (1 + Math.random() * 6) * 3, 20 + (int) (1 + Math.random() * 6) * 3, 5 + (int) (1 + Math.random() * 6) * 3, 0, 0);



  }
}
