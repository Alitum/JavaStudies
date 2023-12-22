
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // Criando uma lista de dados
        List<Dado> listaDados = new ArrayList<>();
        listaDados.add(new Dado(1, 10.5, "Categoria A", LocalDate.of(2023, 1, 10)));
        listaDados.add(new Dado(2, 15.2, "Categoria B", LocalDate.of(2023, 3, 5)));
        listaDados.add(new Dado(3, 8.7, "Categoria A", LocalDate.of(2023, 2, 15)));
        listaDados.add(new Dado(4, 20.0, "Categoria C", LocalDate.of(2023, 4, 20)));

        // Instanciando a classe AnaliseDados
        AnaliseDados analise = new AnaliseDados(listaDados);

        // Exemplos de análises utilizando streams
        System.out.println("Filtrar por Categoria 'Categoria A':");
        analise.filtrarPorCategoria("Categoria A").forEach(System.out::println);

        System.out.println("\nSoma dos valores da Categoria 'Categoria B':");
        System.out.println(analise.calcularSomaDosValores("Categoria B"));

        System.out.println("\nValor máximo:");
        analise.encontrarValorMaximo().ifPresent(System.out::println);

        System.out.println("\nAgrupar por Categoria:");
        analise.agruparPorCategoria().forEach((categoria, dados) -> {
            System.out.println(categoria + ":");
            dados.forEach(System.out::println);
        });

        System.out.println("\nOrdenar por Valor e Data:");
        analise.ordenarPorValorEData().forEach(System.out::println);

        // Demonstração da eficiência das operações com Streams vs. Abordagem imperativa
        // Vamos calcular a soma dos valores da 'Categoria A' usando ambas as abordagens

        // Usando Streams
        long startStream = System.nanoTime();
        double somaStream = analise.calcularSomaDosValores("Categoria A");
        long endStream = System
                .nanoTime();
        System.out.println("\nTempo usando Streams: " + (endStream - startStream) + " nanossegundos");
        System.out.println("Soma usando Streams: " + somaStream);

        // Usando abordagem imperativa
        long startImperative = System.nanoTime();
        double somaImperative = calcularSomaCategoriaAImperativo(listaDados);
        long endImperative = System
                .nanoTime();
        System.out.println(
                "\nTempo usando abordagem imperativa: " + (endImperative - startImperative) + " nanossegundos");
        System.out.println("Soma usando abordagem imperativa: " + somaImperative);
    }

    // Abordagem imperativa para calcular a soma dos valores da 'Categoria A'
    private static double calcularSomaCategoriaAImperativo(List<Dado> listaDados) {
        double soma = 0;
        for (Dado dado : listaDados) {
            if (dado.getCategoria().equals("Categoria A")) {
                soma += dado.getValor();
            }
        }
        return soma;
    }
}