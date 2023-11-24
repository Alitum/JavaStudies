import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();

        list.add("Fulano");
        list.add("Ciclano");
        list.add("Beltrano");
        list.add("Helton");
        list.add("Jhonny");

        System.out.println("> Full List");
        System.out.println(list);

        System.out.println("> Checking a Name");
        if (list.contains("Fulano")) {

            System.out.println("The list contains Fulano");

        } else {
            System.out.println("The list does not contain Fulano");
        }

        System.out.println("> Removing a Name");
        if (list.remove("Fulano")) {

            System.out.println("Fulano removed");

        } else {
            System.out.println("Fulano not removed");
        }

        System.out.println("> Checking a Name");
        if (list.contains("Fulano")) {

            System.out.println("The list contains Fulano");

        } else {
            System.out.println("The list does not contain Fulano");
        }

        System.out.println("> Full List");
        System.out.println(list);

        System.out.println("> Sorting Alphabetically");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);

        System.out.println("> Sub List");
        List<String> subList = list.subList(1, 3);
        System.out.println(subList);

        System.out.println("> Clear List");
        list.clear();
        System.out.println(list);
    }
}
