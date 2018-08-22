package main.java.music;

public class Violin extends StringedInstrument{

  public Violin(){
    super();
    numberOfStrings = 4;
  }

  public Violin(int numberOfStrins){
    super();
    this.numberOfStrings = numberOfStrins;
  }

  @Override
  public String sound() {
    return "Screech";
  }

  @Override
  public void play() {
    System.out.println("Violin, a " + numberOfStrings + "-stringed instrument that goes " + sound());

  }
}
