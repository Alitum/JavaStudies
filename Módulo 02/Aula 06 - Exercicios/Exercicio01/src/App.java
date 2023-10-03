import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int answer2 = 1;
        do {
            System.out.println("Type the first number:");
            double a = sc.nextDouble();
            System.out.println("Type the second number:");
            double b = sc.nextDouble();
            do {
                System.out
                        .println("What do you want to do?\n1 - Sum\n2 - Subtract\n3 - Multiply\n4 - Divide\n5 - Exit");
                answer = sc.nextInt();
                switch (answer) {
                    case 1:
                        System.out.println("The sum of " + a + " and " + b + " is " + Calculator.sum(a, b));
                        break;
                    case 2:
                        System.out.println("The difference of " + a + " and " + b + " is " + Calculator.subtract(a, b));
                        break;
                    case 3:
                        System.out.println("The product of " + a + " and " + b + " is " + Calculator.multiply(a, b));
                        break;
                    case 4:
                        System.out.println("The quotient of " + a + " and " + b + " is " + Calculator.divide(a, b));
                        break;
                    case 5:
                        System.out.println("Bye.");
                        break;
                    default:
                        System.out.println("Invalid option, try again.");
                }
            } while (answer != 1 && answer != 2 && answer != 3 && answer != 4 && answer != 5);
            if (answer != 5) {
                do {
                    if (answer2 != 1 && answer2 != 2)
                        System.out.println("Invalid option, try again.");
                    System.out.println("Would you like to try again? 1 - Yes, 2 - No");
                    answer2 = sc.nextInt();
                } while (answer2 != 1 && answer2 != 2);
            }

        } while (answer2 == 1 && answer != 5);
        sc.close();
    }
}
