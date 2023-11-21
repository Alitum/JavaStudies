public class Car implements Vehicle, Security {

  @Override
  public void TurnOn() {
    System.out.println("Car turned on");
  }

  @Override
  public void SpeedUp() {
    System.out.println("Car speeding up");
  }

  @Override
  public void TurnOnLock() {
    System.out.println("Car turned on lock");
  }

  @Override
  public void TurnOnAlarm() {
    System.out.println("Car turned on alarm");
  }
}
