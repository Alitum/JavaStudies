public interface Repository<T> {

  public void add(T item) throws ConflictingReservationException;

  public void remove(T item);

  public <R> T search(R index) throws ConflictingReservationException;
}
