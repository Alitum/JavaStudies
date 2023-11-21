public class Motorcycle extends Vehicle {

  private int amtCC;

  public Motorcycle(String brand, String model, int year, int amtCC) {
    super(brand, model, year);
    this.amtCC = amtCC;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + "Cylinder capacity: " + this.amtCC;
  }

}
