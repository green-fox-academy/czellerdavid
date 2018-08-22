class Person {

  String name;
  int age;
  String gender;

  public void introduce() {
    System.out.println("Hi, I'm" + ", a " + age + " year old" + gender);
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public Person(String name,  int age, String gender){
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public Person(){
    this.name = "Jane Doe";
    this.gender = "Female";
    this.age = 30;
  }
}
