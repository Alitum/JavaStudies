import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        // ? java.util.Date
        // * Date date = new Date();
        // * System.out.println(date);

        // ? java.util.Calendar
        // * Calendar cal = Calendar.getInstance();
        // * cal.set(2023, Calendar.JULY, 15);
        // * Date date = cal.getTime();
        // * System.out.println(date);

        // ? java.util.LocalDate and java.util.LocalDateTime

        Scanner sc = new Scanner(System.in);

        LocalDate todayDate = LocalDate.now();
        LocalDateTime specificDateTime = LocalDateTime.of(2023, 7, 15, 14, 30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dateString = sc.next();

        LocalDate stringDate = LocalDate.parse(dateString, formatter);

        System.out.println(stringDate);

        // System.out.println(date);
        // System.out.println(formattedDate);
        // System.out.println(stringDate);
        // System.out.println(specificDateTime);

    }
}
