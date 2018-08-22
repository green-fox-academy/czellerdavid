package main.java.music;

public class F35 extends Aircraft {


  public F35() {
    maxAmmo = 12;
    baseDamage = 50;
    isPriority = true;

  }

  @Override
  public String getType() {
    return "F35";
  }


}
