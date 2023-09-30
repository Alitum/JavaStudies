public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student(2023001, "Fulano");
        Student student02 = new Student(2023001, "Fulano");

        System.out.println(student.equals(student02));
        System.out.println(student.hashCode());

        System.out.println(student02.hashCode());
    }
}
