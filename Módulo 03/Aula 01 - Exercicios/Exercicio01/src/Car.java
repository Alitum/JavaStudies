public class Car extends Vehicle {
  private int amtDoors;

  public Car(String brand, String model, int year, int amtDoors) {
    super(brand, model, year);
    this.amtDoors = amtDoors;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + "Amount of doors: " + this.amtDoors;
  }

}
