public class Clothing {
  private String name;

  public Clothing(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "[Name: " + name + "]";
  }

}
