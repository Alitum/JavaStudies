public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car();

        car.setbrand("Hyundai");
        car.setModel("I30");
        car.setColor("White");

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
    }
}
