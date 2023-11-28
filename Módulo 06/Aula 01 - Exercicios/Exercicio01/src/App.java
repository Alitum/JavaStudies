public class App {
    public static void main(String[] args) throws Exception {
        StringManipulator manipulator = new StringManipulator();
        System.out.println(manipulator.concatenate.apply("Hello", " World"));
        System.out.println(manipulator.firstString.apply("Hello", "World"));
    }
}
