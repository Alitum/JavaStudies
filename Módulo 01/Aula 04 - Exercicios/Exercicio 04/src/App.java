public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("[Aula04] Exercício 04 - do-while");

        int number = 1;

        System.out.println("Contagem inciada");
        do {
            System.out.println(number);
            number++;
        } while (number <= 5);
        System.out.println("Contagem finalizada");
    }
}
