public class Square extends Shape {

  public Square(String color) {
    super(color);
  }

  @Override
  public void draw() {
    System.out.println("Drawning a square with color " + super.color);
  }

}
