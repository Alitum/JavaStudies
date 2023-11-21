abstract public class Animal {
  protected String name;
  protected int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  abstract String sound();

  @Override
  public String toString() {
    return "Name: " + name + ", Age: " + age + ", ";
  }

}
