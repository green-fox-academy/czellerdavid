public class Flower extends Plant {

  public Flower(String name) {

    currentWater = 0;
    this.name = name;

  }

  public String waterStatus() {

    if (needsWater()) {

      return "The " + name + " flower needs water! Because the current water level is: " + Double.valueOf(currentWater).intValue() + " (Recommended level is: 5)";
    }

    return "The " + name + " flower does not need water! Because the current water level is: " + Double.valueOf(currentWater).intValue();
  }

  @Override
  public void watering(double waterAmount) {

    if (needsWater()) {
      currentWater = currentWater + waterAmount * 0.75;

    }
  }

  @Override
  public boolean needsWater() {
    return currentWater < 5;
  }
}
