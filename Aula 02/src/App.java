public class App {
    public static void main(String[] args) throws Exception {

        Class class1 = new Class();

        try {
            class1.addStudent("Fulaninho", 10, 10);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        class1.obtainClassAverage();

    }
}
