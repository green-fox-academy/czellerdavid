package main.java.music;

public class Aircraft {

  int maxAmmo;
  int baseDamage;
  int currentAmmo;


  public int fight(){
    int damage = currentAmmo * baseDamage;
    currentAmmo = 0;

    return damage;
  }

  public int refill(int amount){
    currentAmmo = currentAmmo + amount;
    if (currentAmmo > maxAmmo){
      currentAmmo = maxAmmo;
    }
    return currentAmmo;
  }

}
