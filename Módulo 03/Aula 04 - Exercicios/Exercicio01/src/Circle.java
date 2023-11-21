public class Circle extends Shape {

  public Circle(String color) {
    super(color);
  }

  @Override
  public void draw() {
    System.out.println("Drawning a circle with color " + super.color);
  }

}
