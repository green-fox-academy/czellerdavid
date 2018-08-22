package main.java.music;

public class ElectricGuitar extends StringedInstrument{

  public ElectricGuitar(){
   super();
   numberOfStrings = 6;

  }

  public ElectricGuitar(int numberOfStrings) {
    super();
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    return "Twang";
  }

  @Override
  public void play() {
    System.out.println("Electric Guitar, a " + numberOfStrings + "-stringed instrument that goes " + sound());

  }
}
