public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  public void communicate() {
    System.out.println(name + " the dog is barking");
  }

  public void play() {
    System.out.println(name + " the dog is playing");
  }
}
