public class App {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2022);
        Car car = new Car("Toyota", "Corolla", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CB500", 2021, 500);

        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(motorcycle);
    }
}
