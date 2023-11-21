public class Circle extends Shape {
  private double radius;

  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
  }

  @Override
  double calcArea() {
    return Math.PI * radius * radius;
  }

}
