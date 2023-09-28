public class Student {
  String name;
  Integer registration;
  Integer amntOfFouls;

  public void addFoul() {
    amntOfFouls++;
  }

  public void specStudent() {

    System.out.println("Inspect student");
    System.out.println("Student name: " + name);
    System.out.println("Student registration: " + registration);
    System.out.println("Amount of fouls: " + amntOfFouls);
  }
}