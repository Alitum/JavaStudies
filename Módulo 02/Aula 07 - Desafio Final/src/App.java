import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Desafio final - módulo 02");
        DecimalFormat df = new DecimalFormat("#.00");
        df.setMaximumFractionDigits(2);
        Class class01 = new Class(1);
        Class class02 = new Class(2);
        Student student01 = new Student("Robson", 18, "000001", 7);
        Student student02 = new Student("Jhonatan", 18, "000002", 4);
        Student student03 = new Student("Carlos", 18, "000003", 5.5);
        Student student04 = new Student("Daniel", 18, "000004", 6);
        Student student05 = new Student("Eduardo", 18, "000005", 0);
        Student student06 = new Student("Fernanda", 18, "000006", 9.1);
        Student student07 = new Student("Gabriel", 18, "000007", 9.9);
        Student student08 = new Student("Helena", 18, "000008", 0.1);

        class01.addStudent(student01);
        class01.addStudent(student02);
        class01.addStudent(student03);
        class01.addStudent(student04);
        class01.addStudent(student05);
        class02.addStudent(student06);
        class02.addStudent(student07);
        class02.addStudent(student08);

        System.out.println("Class 01");
        System.out.println("To string");
        System.out.println(class01);
        System.out.println("Amount of students:");
        System.out.println(class01.getAmtStudents());
        System.out.println("Average:");
        System.out.println(df.format(class01.getClassAverage()));
        System.out.println("Class 02");
        System.out.println("To string:");
        System.out.println(class02);
        System.out.println("Amount of students:");
        System.out.println(class02.getAmtStudents());
        System.out.println("Average:");
        System.out.println(df.format(class02.getClassAverage()));
    }
}
