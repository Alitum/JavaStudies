public class Car {
  private String brand;
  private String model;
  private String color;
  private boolean itsOn;
  private Integer amtOfFuel;

  public String getBrand() {
    return this.brand;
  }

  public String getModel() {
    return this.model;
  }

  public String getColor() {
    return this.color;
  }

  public boolean isItsOn() {
    return this.itsOn;
  }

  public Integer getAmtOfFuel() {
    return this.amtOfFuel;
  }

  public void setbrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setItsOn(boolean itsOn) {
    this.itsOn = itsOn;
  }

  public void setAmtOfFuel(Integer amtOfFuel) {
    this.amtOfFuel = amtOfFuel;
  }

}