package main.java.music;

public class Main {

  public static void main(String[] args) {

   Carrier carrier = new Carrier(120, 5000);
    F16 alfa1 = new F16();
    F16 alfa2 = new F16();
    F16 alfa3 = new F16();
    F35 alfa4 = new F35();
    F35 alfa5 = new F35();
    F35 alfa6 = new F35();
    F35 alfa7 = new F35();
    carrier.add(alfa1);
    carrier.add(alfa2);
    carrier.add(alfa3);
    carrier.add(alfa4);
    carrier.add(alfa5);
    carrier.add(alfa6);
    carrier.add(alfa7);
    while(carrier.hp > 0 && carrier.ammo > 0) {
      try {
        carrier.fill();
      } catch (Exception e) {
        e.printStackTrace();
      }
      carrier.fight(carrier);
      System.out.println(carrier.getStatus());
    }
  }
}
