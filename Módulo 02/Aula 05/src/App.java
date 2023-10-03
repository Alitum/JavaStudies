public class App {
    public static void main(String[] args) throws Exception {
        // DayWeek day = DayWeek.MONDAY;

        // System.out.println("Today is: " + day);

        // if (day == DayWeek.SUNDAY) {
        // System.out.println("It's rest day!");
        // } else {
        // System.out.println("It's not the weekend yet.");
        // }
        Teacher teacher = new Teacher("Robson", "Science");
        Class class1 = new Class(303, 30, teacher);

        System.out.println(class1);
    }
}