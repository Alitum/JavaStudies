public class Student {
  String firstName;
  String lastName;
  Integer registration;
  Integer amntOfFouls;

  public Student(String firstName, String lastName, Integer registration) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.registration = registration;
    this.amntOfFouls = 0;
  }

  public Student() {

  }

  public void addFoul() {
    amntOfFouls++;
  }

  public void addFoul(Integer fouls) {
    amntOfFouls += fouls;
  }

  public void specStudent() {

    System.out.println("==============================================");
    System.out.println("Inspecting student: " + firstName);
    System.out.println("Student complete name: " + firstName + " " + lastName);
    System.out.println("Student registration: " + registration);
    System.out.println("Amount of fouls: " + amntOfFouls);
  }
}