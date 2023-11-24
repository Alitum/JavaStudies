public class App {
    public static void main(String[] args) throws Exception {
        Course codeCourse = new Course("Programming", "Marlon");

        codeCourse.addDiscipline("Java");
        codeCourse.addDiscipline("C");
        codeCourse.addDiscipline("Logic");

        codeCourse.addStudent("2023-001", "Jhonny");
        codeCourse.addStudent("2023-002", "Emerson");
        codeCourse.addStudent("2023-003", "Fabiana");
        codeCourse.addStudent("2023-004", "Josie");

        if (codeCourse.hasStudent("Jhonny")) {
            System.out.println("Jhonny is in the course");
        } else {
            System.out.println("Jhonny is not in the course");
        }

        System.out.println(codeCourse);

        codeCourse.removeStudent("2023-001", "Jhonny");
        codeCourse.removeDiscipline("C");

        System.out.println(codeCourse);
    }
}
