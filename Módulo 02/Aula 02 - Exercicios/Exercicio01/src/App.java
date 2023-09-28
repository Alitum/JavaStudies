public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Fulano", "da Silva", 20230001);
        Student student2 = new Student();

        student2.firstName = "Beltrano";
        student2.lastName = "Costa";
        student2.registration = 20230002;
        student2.amntOfFouls = 0;

        student.specStudent();
        student2.specStudent();

        student.addFoul();
        student2.addFoul(7);

        student.specStudent();
        student2.specStudent();
    }
}
