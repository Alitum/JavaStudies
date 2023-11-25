import java.time.LocalDate;

public class Reservation {
  private String index;
  private String customerName;
  private String room;
  private int totalDays;

  private LocalDate checkInDate;
  private LocalDate checkOutDate;

  public Reservation(String index, String customerName, String room, int totalDays, LocalDate checkInDate,
      LocalDate checkOutDate) {
    this.index = index;
    this.customerName = customerName;
    this.room = room;
    this.totalDays = totalDays;
    this.checkInDate = checkInDate;
    this.checkOutDate = checkOutDate;
  }

  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getRoom() {
    return room;
  }

  public void setRoom(String room) {
    this.room = room;
  }

  public int getTotalDays() {
    return totalDays;
  }

  public void setTotalDays(int totalDays) {
    this.totalDays = totalDays;
  }

  public LocalDate getCheckInDate() {
    return checkInDate;
  }

  public void setCheckInDate(LocalDate checkInDate) {
    this.checkInDate = checkInDate;
  }

  public LocalDate getCheckOutDate() {
    return checkOutDate;
  }

  public void setCheckOutDate(LocalDate checkOutDate) {
    this.checkOutDate = checkOutDate;
  }

  @Override
  public String toString() {
    return "Reservation [index: " + index + " | customerName: " + customerName + " | room: " + room + " | totalDays:"
        + totalDays + " | checkInDate: " + checkInDate + " | checkOutDate: " + checkOutDate + "]";
  }

}
