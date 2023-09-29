import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount("Fulano da Silva", "00875021-23", 100.00);
        Scanner sc = new Scanner(System.in);

        int option = 0;
        double amount = 0.00;

        System.out.println("===========================================");
        System.out.println("Holder name: " + bankAccount.getHolderName());
        System.out.println("Account number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: " + bankAccount.getBalance());
        do {
            amount = 0;
            System.out.println("===========================================");
            System.out.println("What would you like to do? \nDeposit (1), Withdraw (2), Info (3), or Exit (4)?");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("===========================================");
                    System.out.println("How much would you like to deposit?");
                    amount = sc.nextDouble();
                    bankAccount.deposit(amount);
                    System.out.println("===========================================");
                    System.out.println("Successfully deposited!\nAmount deposited: " + amount + "\nYour new balance is "
                            + bankAccount.getBalance());
                    break;
                case 2:
                    System.out.println("===========================================");
                    System.out.println("Current balance: " + bankAccount.getBalance());
                    System.out.println("How much would you like to withdraw?");
                    amount = sc.nextDouble();
                    if (bankAccount.withdraw(amount)) {
                        System.out.println("=============== ============================");
                        System.out.println("Successfully withdrawn!\nAmount withdrawn: " + amount +
                                "\nYour new balance is "
                                + bankAccount.getBalance());
                    } else {
                        System.out.println("===========================================");
                        System.out.println("Insufficient funds!");
                    }
                    break;
                case 3:
                    System.out.println("===========================================");
                    System.out.println("Holder name: " + bankAccount.getHolderName());
                    System.out.println("Account number: " + bankAccount.getAccountNumber());
                    System.out.println("Balance: " + bankAccount.getBalance());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("===========================================");
                    System.out.println("Invalid option. Please try again.");
                    break;

            }

        } while (option != 4);
        sc.close();
    }
}
