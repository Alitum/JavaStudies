public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("[CLASS] \n");
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.communicate();
        dog.communicate();

        System.out.println("\n[INTERFACE] \n");
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.turnOn();
        car.speedUp();

        motorcycle.turnOn();
        motorcycle.speedUp();

    }
}
