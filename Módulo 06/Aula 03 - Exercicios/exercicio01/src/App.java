import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("ODD NUMBERS");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Pre:");
        System.out.println(numbers);

        Stream<Integer> filterStream = numbers.stream().filter(number -> number % 2 != 0);
        System.out.println("Pos:");

        System.out.println(filterStream.toList());

        System.out.println("UPPER CASE WORDS");
        List<String> words = Arrays.asList("Java", "Lambda", "Interface", "Função");

        System.out.println("Pre:");
        System.out.println(words);

        Stream<String> wordsUpperCase = words.stream().map(String::toUpperCase);

        System.out.println("Pos:");
        System.out.println(wordsUpperCase.toList());

        System.out.println("FOR STREAM METHOD");
        List<Integer> integers = Arrays.asList(5, 10, 15, 20);

        System.out.println("Pre:");
        System.out.println(integers);

        Stream<Integer> intStream = integers.stream();

        System.out.println("Pos:");
        intStream.forEach(System.out::println);

    }
}
