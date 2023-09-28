import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // ? instanciando o objeto Scanner

        // System.out.println("Digite sua idade: ");
        // int age = sc.nextInt();

        // System.out.println("Digite seu peso");
        // double weight = sc.nextDouble();

        // System.out.println("Sua idade é " + age);
        // System.out.println("Seu peso é " + weight);

        boolean continuar = true;

        do {
            System.out.println("Você deseja sair? Digite sim ou nao");
            String resposta = sc.next();

            if (resposta.equals("sim")) {
                System.out.println("Obrigado. Tenha um ótimo dia!");
                continuar = false;
            } else if (resposta.equals("nao")) {
                System.out.println("Oba!");
            } else {
                System.out.println("Opção inválida. Tente novamente");
            }
        } while (continuar);
    }
}
