public class Dog extends Animal {

  public Dog(String name, int age) {
    super(name, age);
  }

  @Override
  String sound() {
    return "woof";
  }

  @Override
  public String toString() {
    return "[DOG] " + super.toString() + "Sound: " + sound();
  }

}
