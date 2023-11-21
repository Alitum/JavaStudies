public class Car implements Vehicle {

  @Override
  public void turnOn() {
    System.out.println("The car is turning on");
  }

  @Override
  public void speedUp() {
    System.out.println("The car is speeding up");
  }

}
