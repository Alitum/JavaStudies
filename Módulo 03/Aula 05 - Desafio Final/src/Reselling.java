public class Reselling {
  protected Vehicle vehicle01;
  protected Vehicle vehicle02;
  protected Vehicle vehicle03;
  protected Vehicle vehicle04;
  protected Vehicle vehicle05;

  public void addVehicle(Vehicle vehicle) {
    if (vehicle01 == null) {
      this.vehicle01 = vehicle;
      return;
    } else if (vehicle02 == null) {
      this.vehicle02 = vehicle;
      return;
    } else if (vehicle03 == null) {
      this.vehicle03 = vehicle;
      return;
    } else if (vehicle04 == null) {
      this.vehicle04 = vehicle;
      return;
    } else if (vehicle05 == null) {
      this.vehicle05 = vehicle;
      return;
    } else {
      System.out.println("The reseller is full");
    }
  }

  public void removeVehicle(String plate) {
    if (plate == vehicle01.getPlate()) {
      vehicle01 = null;
    } else if (plate == vehicle02.getPlate()) {
      vehicle02 = null;
    } else if (plate == vehicle03.getPlate()) {
      vehicle03 = null;
    } else if (plate == vehicle04.getPlate()) {
      vehicle04 = null;
    } else if (plate == vehicle05.getPlate()) {
      vehicle05 = null;
    } else {
      System.out.println("Vehicle not found");
    }
  }

  public void listVehicles() {
    if (vehicle01 != null) {
      System.out.println(vehicle01.toString());
    }
    if (vehicle02 != null) {
      System.out.println(vehicle02.toString());
    }
    if (vehicle03 != null) {
      System.out.println(vehicle03.toString());
    }
    if (vehicle04 != null) {
      System.out.println(vehicle04.toString());
    }
    if (vehicle05 != null) {
      System.out.println(vehicle05.toString());
    }
  }

  public void addDiscount(String plate, double value) {
    if (plate == vehicle01.getPlate()) {
      vehicle01.applyPromotion(value);
    } else if (plate == vehicle02.getPlate()) {
      vehicle02.applyPromotion(value);
    } else if (plate == vehicle03.getPlate()) {
      vehicle03.applyPromotion(value);
    } else if (plate == vehicle04.getPlate()) {
      vehicle04.applyPromotion(value);
    } else if (plate == vehicle05.getPlate()) {
      vehicle05.applyPromotion(value);
    } else {
      System.out.println("Vehicle not found");
    }
  }
}
