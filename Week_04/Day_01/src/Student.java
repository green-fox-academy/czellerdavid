public class Student extends Person{

 String previousOrganization;
 int skippedDays;

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + ", a " + age + "  year old " + gender + " from " + previousOrganization + "who skipped " + skippedDays + " days from the course already.");
  }
  public void skipDays(int numberOfDays) {

    numberOfDays = numberOfDays + skippedDays;

  }
  Student(String name, int age, String gender, String previousOrganization){
//    this.name = name;
//    this.age = age;
//    this.gender = gender;
    super(name, age, gender);
    this.previousOrganization = previousOrganization;

  }
  Student(){
//    name = "Jane Doe";
//    age = 30;
//    gender = "Female";
    super("Jane Doe", 30, "Female");
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }
}
