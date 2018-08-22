package main.java.music;

public abstract class Aircraft {

  int maxAmmo;
  int baseDamage;
  int currentAmmo;
  public boolean isPriority;

  public int fight() {
    int damage = currentAmmo * baseDamage;
    currentAmmo = 0;

    return damage;
  }

  public int refill(int amount) {
    currentAmmo = currentAmmo + amount;
    if (currentAmmo > maxAmmo) {
      currentAmmo = maxAmmo;
    }
    return currentAmmo;
  }

  public abstract String getType();


  public String getStatus() {
    return "Type " + getType() + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: " + currentAmmo * baseDamage;
  }
}
