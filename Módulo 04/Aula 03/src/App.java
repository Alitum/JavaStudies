import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        List<String> list2 = new ArrayList<>();

        list2.add("Java");
        list2.add("Javascript");
        list2.add("PHP");

        list.add("Computer");
        list.add("Gaming chair");

        System.out.println(list);

        list.addAll(list2);

        System.out.println(list);

        list.removeAll(list2);

        System.out.println(list);
    }
}