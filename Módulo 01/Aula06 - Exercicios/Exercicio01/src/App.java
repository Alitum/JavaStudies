import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean bContinue = true;

        do {
            System.out.println("Deseja continuar? (s/n)");
            String answer = sc.next();
            if (answer.equals("n")) {
                bContinue = false;
            } else if (answer.equals("s")) {
                bContinue = true;
            } else {
                System.out.println("Opção inválida!");
            }
            if (answer.equals("s")) {

                System.out.println("Digite um número: ");
                double num1 = sc.nextDouble();
                System.out.println("Digite outro número: ");
                double num2 = sc.nextDouble();
                System.out.println(
                        "Qual operação você deseja realizar entre eles? \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");

                int op = sc.nextInt();
                String opName = "";
                Double result = 0.0;
                switch (op) {
                    case 1:
                        result = num1 + num2;
                        opName = "soma";
                        break;
                    case 2:
                        result = num1 - num2;
                        opName = "subtração";
                        break;
                    case 3:
                        result = num1 * num2;
                        opName = "multiplicação";
                        break;
                    case 4:
                        result = num1 / num2;
                        opName = "divisão";
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
                if (op >= 1 && op <= 4) {
                    System.out.println("O resultado da " + opName + " entre " + num1 + " e " + num2 + " é: " + result);
                }
            }
        } while (bContinue);
    }
}
