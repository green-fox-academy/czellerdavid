import java.util.ArrayList;
import java.util.List;

public abstract class Plant {

  public double currentWater;
  public String name;

  public abstract boolean needsWater();

  public abstract void watering(double waterAmount);

  public abstract String waterStatus();

}
