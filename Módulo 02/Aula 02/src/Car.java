public class Car {
  String brand;
  String model;
  String color;
  boolean itsOn;
  Integer amtOfFuel;

  public Car(String brand, String model, String color) {
    this.brand = brand;
    this.model = model;
    this.color = color;
  }

  public Car() {

  }

  public void start() {
    this.itsOn = true;
    System.out.println("Starting the car...");
  }

  public void stop() {
    this.itsOn = false;
    System.out.println("Stopping the car...");
  }

  public Integer getAmtOfFuel() {
    return amtOfFuel;
  }
}