public class App {
    public static void main(String[] args) throws Exception {
        Box<String> stringBox = new Box<>();
        Box<Integer> intBox = new Box<>();
        stringBox.setContent("Hello");
        intBox.setContent(42);

        System.out.println(stringBox.getContent());
        System.out.println(intBox.getContent());
    }
}
