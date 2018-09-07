public class Tree extends Plant {


  public Tree(String name) {

    currentWater = 0;
    this.name = name;

  }

  public String waterStatus() {

    if (needsWater()) {

      return "The " + name + " tree needs water! Because the current water level is: " + Double.valueOf(currentWater).intValue() + " (Recommended level is: 10)";
    }

    return "The " + name + " tree does not need water! Because the current water level is: " + Double.valueOf(currentWater).intValue();
  }

  @Override
  public void watering(double waterAmount) {

    if (needsWater()) {
      currentWater = currentWater + waterAmount * 0.4;
    }
  }

  @Override
  public boolean needsWater() {
    return currentWater < 10;
  }
}
