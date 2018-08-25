package main.java.music;

import java.util.ArrayList;
import java.util.Collections;

public class Carrier {

  int damage;
  int ammo;
  int hp;
  ArrayList<Aircraft> Aircrafts = new ArrayList<Aircraft>();


  public Carrier(int ammo, int hp) {
    this.ammo = ammo;
    this.hp = hp;
  }

  public void add(Aircraft a) {
    Aircrafts.add(a);
  }

  public void hit(int damage){
    this.damage += damage;
    this.hp -= damage;
  }

  public void fill() {
    //   public void fill() throws Exception {
//    if (ammo == 0) {
//      throw new Exception("Out of ammo");
//    }
    Collections.sort(Aircrafts, (a, b) -> a.isPriority == b.isPriority ? 0 : a.isPriority ? 1 : -1);
    Collections.sort(Aircrafts, new AircraftPriorityComparator());

    for (int i = 0; i < Aircrafts.size(); i++) {
      Aircraft a = Aircrafts.get(i);
      if (ammo >= a.maxAmmo) {
        ammo = ammo - a.maxAmmo;
        a.refill(a.maxAmmo);
      }
      else if (ammo != 0) {
        a.refill(ammo);
        ammo = 0;
      }
 }
  }

  public void fight(Carrier c) {
    for (int i = 0; i < Aircrafts.size(); i++) {
      Aircraft a = Aircrafts.get(i);
      int damage = a.fight();
      c.hit(damage);
    }
  }

  public String getStatus(){
    if(hp <= 0){
      return "It's dead Jim :(";
    }
      String status = "HP: " + hp + ", Aircraft count: " + Aircrafts.size() + ", Ammo Storage: " + ammo + ", Total damage: " + damage;
      status += "\n Aircrafts: \n";
    for (int i = 0; i < Aircrafts.size() ; i++) {
      Aircraft a = Aircrafts.get(i);
      status += a.getStatus() + "\n";
    }
      return status;
  }
}


