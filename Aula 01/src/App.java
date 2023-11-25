public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }

        int[] numbers = { 1, 2, 3 };
        try {
            System.out.println(numbers[5]);
        } catch (Exception e) {
            System.out.println("Index out of bounds");
        }
    }
}
