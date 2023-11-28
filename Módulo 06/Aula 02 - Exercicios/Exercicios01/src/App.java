import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isPair = numero -> numero % 2 == 0;

        List<Integer> numeros2 = new ArrayList<>();
        for (Integer number : numeros) {
            if (isPair.test(number)) {
                numeros2.add(number);
            }
        }

        System.out.println("TODOS OS NUMEROS:");
        System.out.println(numeros);
        System.out.println("APENAS OS NUMEROS PAR:");
        System.out.println(numeros2);

        List<String> palavras = Arrays.asList("Java", "Lambda", "Interface", "Função");
        Function<String, Integer> stringLenght = t -> t.length();
        List<Integer> palavras2 = new ArrayList<>();
        for (String word : palavras) {
            palavras2.add(stringLenght.apply(word));
        }

        System.out.println("PALAVRAS:");
        System.out.println(palavras);
        System.out.println("TAMANHO DAS PALAVRAS:");
        System.out.println(palavras2);

        System.out.println("SAUDACOES:");
        List<String> nomes = Arrays.asList("Maria", "João", "Lucas");

        Consumer<String> saudar = nome -> System.out.println("Olá " + nome);
        for (String nome : nomes) {
            saudar.accept(nome);
        }

    }
}
