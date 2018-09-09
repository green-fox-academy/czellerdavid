public class AnimalShelter {
  public static void main(String[] args) {

    Shelter myShelter = new Shelter("Shelter");


    myShelter.fillShelter();
    myShelter.adopting();

    System.out.println(myShelter.toString());


  }
}
