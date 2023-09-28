public class App {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Honda";
        car.model = "Civic";
        car.color = "Red";
        car.amtOfFuel = 50;

        System.out.println("Car brand: " + car.brand);
        System.out.println("Car model: " + car.model);
        System.out.println("Car color: " + car.color);
        System.out.println("Car fuel: " + car.getAmtOfFuel());
        System.out.println("Is the car on?: " + car.itsOn);

        car.start();
        System.out.println("Is the car on?: " + car.itsOn);
    }
}
