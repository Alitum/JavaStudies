import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        boolean result = compare("abc", "abc");
        System.out.println(result);

        processList(Arrays.asList(1, 2, 3));
        processList(Arrays.asList("Fulano", "Beltrano", "Ciclano"));

        int num1 = 1;
        int num2 = 2;
        System.out.println(sum(num1, num2));

    }

    public static <T> boolean compare(T o1, T o2) {
        return o1.equals(o2);
    }

    public static <T> void processList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }

    }

    public static <T extends Number> double sum(T n1, T n2) {
        return n1.doubleValue() + n2.doubleValue();

    }
}
