public class App {
    public static void main(String[] args) throws Exception {
        double nota1 = 7.0;
        double nota2 = 3.0;
        final double PESO_NOTA = 0.5;

        double media = (nota1 * PESO_NOTA) + (nota2 * PESO_NOTA);

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média final: " + media);

    }
}
