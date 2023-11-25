import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = null;

        try {
            sc.nextInt();
        } catch (NullPointerException e) {
            System.out.println("The variable is null. Please check the code.");
        }
    }
}