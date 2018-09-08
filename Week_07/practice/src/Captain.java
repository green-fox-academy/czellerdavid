public class Captain extends Pirate {

  String name;

  public  Captain(String name){
    this.name = name;
  }



  @Override
  public String toString() {

    return "Captain " + name + " had " + rumCount + " drinks and He is " + captainStatus() + "\n";

  }
}
