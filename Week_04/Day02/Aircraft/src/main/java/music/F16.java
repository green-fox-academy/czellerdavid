package main.java.music;

public class F16 extends Aircraft {

  public F16() {
    maxAmmo = 8;
    baseDamage = 30;
    isPriority = false;

  }

  @Override
  public String getType() {
    return "F16";

  }
}
