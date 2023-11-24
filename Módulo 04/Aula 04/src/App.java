import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Integer> set = new TreeSet<>();

        set.add(2);
        set.add(1);
        set.add(5);
        set.add(4);

        System.out.println(set);
    }
}
