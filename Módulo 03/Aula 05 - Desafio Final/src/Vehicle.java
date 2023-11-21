public abstract class Vehicle implements Promotion {
  protected String plate;
  protected String brand;
  protected String model;
  protected int year;
  protected double price;

  public Vehicle(String plate, String brand, String model, int year, double price) {
    this.plate = plate;
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.price = price;
  }

  public String showInfo() {
    return "Vehicle [ " + brand + " " + model + " | Plate: " + plate + " | Year: " + year + " | Price: "
        + price
        + "]";
  }

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}
