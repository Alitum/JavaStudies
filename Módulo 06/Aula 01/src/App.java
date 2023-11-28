public class App {
    public static void main(String[] args) throws Exception {
        Calculator sum = (a, b) -> a + b;
        Calculator multi = (a, b) -> a * b;

        System.out.println(sum.operation(5, 3));
        System.out.println(multi.operation(5, 3));
    }

}
