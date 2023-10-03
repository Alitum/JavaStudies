public class App {
    public static void main(String[] args) throws Exception {
        Product p1 = new Product("TV", 1000.00, ProductCategory.ELETRONICS);
        Product p2 = new Product("T-Shit", 80.00, ProductCategory.CLOTHING);
        Product p3 = new Product("X-Burguer", 20.00, ProductCategory.FOOD);
        Product p4 = new Product("Detergent", 5.00, ProductCategory.CLEANING);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
