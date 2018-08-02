
import java.util.Scanner;
import java.lang.Math;


public class Bmi {
  public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInM = 1.78;
    int heightInCm = 78;


    Scanner input = new Scanner(System.in);

    //System.out.println("Hello, please");    //System.out.println(massInKg);
    massInKg = input.nextFloat();

    System.out.print(heightInM);
    heightInM = input.nextInt();

    System.out.print(heightInCm);
    heightInCm = input.nextInt();

    //convert measurements
    double weightInKilos = massInKg * 0.453592;
    double heightInMeters = (((heightInM * 12) + heightInCm) * .0254);
    double bmi = weightInKilos / Math.pow(heightInMeters, 2.0);
//      double bmi = weightInKilos / (heightInMeters * heightInMeters);
    System.out.println("Your BMI is: " + bmi);

    //interpret BMI
    if (bmi < 18.5 ) {
      System.out.print("Underweight");
    }

    else if (bmi >= 18.5 && bmi < 25) {
      System.out.print("Normal");
    }

    else if (bmi >= 25 && bmi < 30) {
      System.out.print("Overweight");
    }

    else if (bmi >= 30) {
      System.out.print("FAT!FAT!FAT!FAT!!");
    }


        //bmi = weight (kg) ÷ height^2 (m^2)
    // Print the Body mass index (BMI) based on these values
  }
}
