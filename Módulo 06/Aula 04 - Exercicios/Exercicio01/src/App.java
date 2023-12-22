import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
        public static void main(String[] args) throws Exception {

                // Problema 1: Criar um mapa onde a chave é o nome e o valor é o comprimento
                // desse nome
                List<String> nomes = Arrays.asList("Eduarda", "Emerson", "Jhonas");
                Map<String, Integer> mapaNomes = nomes.stream()
                                .collect(Collectors.toMap(nome -> nome, String::length));

                System.out.println("Mapa de nomes: " + mapaNomes);

                // Problema 2: Agrupar os números por paridade (ímpar e par)
                List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
                Map<String, List<Integer>> numerosPorParidade = numeros.stream()
                                .collect(Collectors.groupingBy(
                                                num -> (num % 2 == 0) ? "NUMEROS PARES" : "NUMEROS ÍMPARES"));

                System.out.println("Números por paridade: " + numerosPorParidade);

                // Problema 3: Retornar um stream de palavras únicas e em ordem alfabética
                List<String> repetidas = Arrays.asList("maçã", "banana", "maçã", "laranja", "banana");
                List<String> unicasOrdenadas = repetidas.stream()
                                .distinct()
                                .sorted()
                                .collect(Collectors.toList());

                String palavrasUnicasOrdenadas = String.join(", ", unicasOrdenadas);
                System.out.println("Palavras únicas ordenadas: " + palavrasUnicasOrdenadas);
        }
}
