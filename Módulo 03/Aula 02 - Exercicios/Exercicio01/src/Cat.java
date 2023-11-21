public class Cat extends Animal {

  public Cat(String name, int age) {
    super(name, age);
  }

  @Override
  String sound() {
    return "Mieow";
  }

  @Override
  public String toString() {
    return "[CAT] " + super.toString() + "Sound: " + sound();
  }

}
