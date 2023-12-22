import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        // // Expressão Lambda
        // Function<Integer, String> lambdaToString = i -> String.valueOf(i);

        // // Método de Referência
        // Function<Integer, String> methodReferenceToString = String::valueOf;

        // List<String> palavras = Arrays.asList("maçã", "banana", "acerola");

        // // Expressão Lambda
        // palavras.forEach(s -> System.out.println(s));

        // // Método de Referência
        // palavras.forEach(System.out::println);

        // String stringExemplo = "Hello";
        // // Expressão Lambda
        // Predicate<String> lambda = s -> stringExemplo.startsWith(s);

        // // Método de Referência
        // Predicate<String> methodReference = stringExemplo::startsWith;

        // System.out.println(lambda.test("H"));

        // List<String> strings = Arrays.asList(1, 2, 10, 30, 50)
        // .stream()
        // .map(String::valueOf)
        // .collect(Collectors.toList());
        // System.out.println(strings);

        Map<String, Integer> map = Stream.of("a", "bc", "def")
                .collect(Collectors.toMap(Function.identity(), f -> f.length()));
        System.out.println(map);
    }
}
