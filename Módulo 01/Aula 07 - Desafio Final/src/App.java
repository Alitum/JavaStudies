import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculadora de IMC");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        float weight = sc.nextFloat();
        System.out.print("Digite sua altura: ");
        float height = sc.nextFloat();

        Float imc = weight / (height * height);

        System.out.println("O seu índice de massa corporal (IMC) é: " + imc);
        if (imc < 18.5) {
            System.out.println("Sua classificação é: Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Sua classificação é: Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sua classificação é: Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Sua classificação é: Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {8
            System.out.println("Sua classificação é: Obesidade grau II");
        } else if (imc >= 40) {
            System.out.println("Sua classificação é: Obesidade grau III");
        }
    }
}
