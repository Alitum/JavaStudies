public class App {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle01 = new Car("DCF-3051", "Toyota", "Corolla", 2020, 158000.0);
        Vehicle vehicle02 = new Car("HTS-1831", "BMW", "X5", 2023, 680000.0);
        Vehicle vehicle03 = new Car("MZO-7869", "Volkswagen", "Beetle", 1997, 49000.0);
        Vehicle vehicle04 = new Motorcycle("AKV-2706", "Yamaha", "YBR", 2022, 15000.0);
        Vehicle vehicle05 = new Motorcycle("MNX-2614", "Suzuki", "GSX", 2021, 70000.0);
        Reselling reselling = new Reselling();

        reselling.addVehicle(vehicle01);
        reselling.addVehicle(vehicle02);
        reselling.addVehicle(vehicle03);
        reselling.addVehicle(vehicle04);
        reselling.addVehicle(vehicle05);

        reselling.listVehicles();

        reselling.addDiscount(vehicle01.getPlate(), 50000.0);
        reselling.addDiscount(vehicle05.getPlate(), 15000.0);
        reselling.addDiscount(vehicle01.getPlate(), 5000.0);
        reselling.addDiscount(vehicle05.getPlate(), 1000.0);

        reselling.listVehicles();
    }
}
