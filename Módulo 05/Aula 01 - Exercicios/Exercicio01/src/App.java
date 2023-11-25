public class App {
    public static void main(String[] args) {
        String numberStr = "123a";
        try {
            int number = Integer.parseInt(numberStr);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Cannot convert " + numberStr + " to number. Please check the variable.");
        }
    }
}