import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Reservation reservation01 = new Reservation("1", "Emerson", "101", 3, LocalDate.now(),
                LocalDate.now().plusDays(3));
        Reservation reservation02 = new Reservation("2", "Cleber", "102", 3, LocalDate.now(),
                LocalDate.now().plusDays(7));
        Reservation reservation03 = new Reservation("3", "Gustavo", "103", 3, LocalDate.now(),
                LocalDate.now().plusDays(9));
        Reservation reservation04 = new Reservation("1", "Fabiana", "101", 3, LocalDate.now(),
                LocalDate.now().plusDays(3));
        ReservationManager reservationManager = new ReservationManager();

        // ? Add reservation in manager
        try {
            reservationManager.add(reservation01);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            reservationManager.add(reservation02);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            reservationManager.add(reservation03);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            reservationManager.add(reservation04);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ? Researches
        try {
            System.out.println(reservationManager.search("3"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(reservationManager.search("1"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(reservationManager.search("4"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ? Removing reservations
        reservationManager.remove(reservation01);

        // ? Search after removing
        try {
            System.out.println(reservationManager.search("1"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
