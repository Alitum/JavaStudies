public class Motorcycle extends Vehicle implements Promotion {

  public Motorcycle(String plate, String brand, String model, int year, double price) {
    super(plate, brand, model, year, price);
  }

  @Override
  public void applyPromotion(double value) {
    if (value <= super.price / 100 * 5) {
      super.price = super.price - value;
      System.out.println("Discount applied");
    } else {
      System.out.println("The amount of the discount exceeds the limit imposed.");
    }
  }

  @Override
  public String toString() {
    return "Motorcycle [ " + brand + " " + model + " | Plate" + plate + " | Year: " + year + " | Price: "
        + price
        + "]";
  }

}
