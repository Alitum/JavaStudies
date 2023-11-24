import java.util.Set;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Integer> set01 = new HashSet<>();

        set01.add(1);
        set01.add(2);
        set01.add(3);
        set01.add(4);
        set01.add(5);
        set01.add(6);
        set01.add(3);

        System.out.println("> Full set");
        System.out.println(set01);

        System.out.println("> Set contains 3?");
        if (set01.contains(3)) {
            System.out.println("3 is in the set");
        } else {
            System.out.println("3 is not in the set");
        }

        System.out.println("> Remove 3");
        if (set01.remove(3)) {
            System.out.println("3 was removed");
        } else {
            System.out.println("3 was not removed");
        }

        System.out.println("> Full set");
        System.out.println(set01);

        System.out.println("> Add some more numbers");
        set01.add(7);
        set01.add(8);
        set01.add(9);

        System.out.println("> Full set");
        System.out.println(set01);

        System.out.println("> Create a copy of the original set");
        Set<Integer> set02 = new HashSet<>(set01);

        System.out.println("> Use method retainAll()");
        set01.retainAll(set02);

        System.out.println("> Full set");
        System.out.println(set01);

        System.out.println("> Clear the set");
        set01.clear();

        System.out.println("> Full set");
        System.out.println(set01);

    }
}
