import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shelter {

  List<Animal> animals = new ArrayList<>();

  String name;

  public Shelter(String name) {
    this.name = name;

  }


  public void addAnimal(Animal animal) {

    animals.add(animal);

  }


  public void fillShelter() {

    Random random = new Random();
    int number = random.nextInt(10) + 1;

    for (int i = 0; i < number; i++) {

      addAnimal(new Animal());

    }
  }

  public void adopting() {

    Random random = new Random();
    int number = random.nextInt(3) + 1;

    int adoptedAnimals = animals.size() - number;


    System.out.println(number + "adopted animal/s");
    System.out.println(adoptedAnimals + "Still in the shelter");

    //return adoptedAnimals;
  }


  @Override
  public String toString() {

    String result = " ";

    result += "Doggies: " + animals.size();

    return result;
  }
}
