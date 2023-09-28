public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.name = "Fulano";
        student.registration = 65165;
        student.amntOfFouls = 0;

        student.specStudent();
        student.addFoul();
        student.specStudent();
    }
}
