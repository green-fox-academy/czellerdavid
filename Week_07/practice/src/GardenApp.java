public class GardenApp {

  public static void main(String[] args) {

    double waterAmount = 90;

    Garden myGarden = new Garden();

    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");
    Tree purple = new Tree("purple");
    Tree orange = new Tree("orange");
    Tree green = new Tree("green");
    Tree green2 = new Tree("green2");

    myGarden.add(yellow);
    myGarden.add(blue);
    myGarden.add(purple);
//    myGarden.add(orange);
//    myGarden.add(green);
//    myGarden.add(green2);
//

    myGarden.watering(waterAmount);

    System.out.println(myGarden.toString());

  }
}
