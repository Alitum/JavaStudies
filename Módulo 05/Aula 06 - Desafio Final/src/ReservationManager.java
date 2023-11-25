import java.util.*;

public class ReservationManager implements Repository<Reservation> {

  Map<String, Reservation> reservationsMap = new HashMap<>();

  @Override
  public void add(Reservation item) {
    if (isConflict(item, reservationsMap.values())) {
      throw new ConflictingReservationException(
          "Conflicting reservation. Please check check-in, check-out, room and index values.");
    } else {
      reservationsMap.put(item.getIndex(), item);
      System.out.println("Reservation added successfully.\nIndex: " + item.getIndex() + " | Customer: "
          + item.getCustomerName() + " | Room: " + item.getRoom() + "\nTotal Days: " + item.getTotalDays()
          + " | Check-in: " + item.getCheckInDate()
          + " | Check-out: " + item.getCheckOutDate());
    }
  }

  @Override
  public void remove(Reservation item) {
    if (reservationsMap.get(item.getIndex()) == null) {
      throw new ReservationNotFoundException("Reservation not found");
    } else {
      reservationsMap.remove(item.getIndex());
      System.out.println("Reservation removed successfully.");
    }
  }

  @Override
  public <R> Reservation search(R index) {
    if (reservationsMap.get(index) == null) {
      throw new ReservationNotFoundException("Reservation with index " + index + " not found");
    } else {
      return reservationsMap.get(index);
    }
  }

  public static boolean isConflict(Reservation r1, Collection<Reservation> collection) {
    for (Reservation r2 : collection) {
      if (r1.getIndex().equals(r2.getIndex())) {
        return true;
      } else if (r1.getCheckInDate().equals(r2.getCheckInDate()) && r1.getRoom().equals(r2.getRoom())) {
        return true;
      } else if (r1.getCheckOutDate().equals(r2.getCheckOutDate()) && r1.getRoom().equals(r2.getRoom())) {
        return true;
      } else if (r1.getCheckInDate().isBefore(r2.getCheckOutDate()) && r1.getRoom().equals(r2.getRoom())) {
        return true;
      } else if (r1.getCheckOutDate().isAfter(r2.getCheckInDate()) && r1.getRoom().equals(r2.getRoom())) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }

}
