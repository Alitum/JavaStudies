public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("[Aula 04] Exercício 02 - switch-case");

        int option = 3;

        switch (option) {
            case 1:
                System.out.println("Voce escolheu a opção 1");
                break;
            case 2:
                System.out.println("Voce escolheu a opção 2");
                break;
            case 3:
                System.out.println("Voce escolheu a opção 3");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
