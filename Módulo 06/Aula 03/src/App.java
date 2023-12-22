import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> stream = list.stream().filter(num -> num % 2 == 0);

        System.out.println(stream.toList());

        Stream<String> transformed = Stream.of("a", "b", "c").map(str -> str.toUpperCase());

        System.out.println(transformed.toList());

        Stream.of("a", "b", "c").forEach(str -> System.out.println(str));

        Optional<Integer> sum = Stream.of(1, 2, 3, 4).reduce((a, b) -> a + b);

        System.out.print(sum.get());

    }
}
