public class Car {
  String brand;
  String model;
  String color;
  boolean itsOn;
  Integer amtOfFuel;

  public void start() {
    itsOn = true;
    System.out.println("Starting the car...");
  }

  public void stop() {
    itsOn = false;
    System.out.println("Stopping the car...");
  }

  public Integer getAmtOfFuel() {
    return amtOfFuel;
  }
}
