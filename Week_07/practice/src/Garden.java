import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> plants = new ArrayList<>();

  public void add(Plant plant) {

    plants.add(plant);

  }

  public void watering(double waterAmount) {

    int count = 0;
    for (Plant plant : plants) {

      if (plant.needsWater()) {
        count++;

      }
    }
    double amount = waterAmount / count;
    for (Plant plant : plants) {

      if (plant.needsWater()) {
        plant.watering(amount);
      }
    }
  }

  @Override
  public String toString() {

    String result = " ";

    for (Plant plant : plants) {

      result += plant.waterStatus();
      result += "\n";
    }


    return result;
  }
}
