abstract public class Shape {
  protected String color;

  public Shape(String color) {
    this.color = color;
  }

  abstract double calcArea();

  public void showColor() {
    System.out.println("Color: " + color);
  }
}
