import java.util.List;
import java.util.ArrayList;

public class Store<T> {

  private List<T> items = new ArrayList<T>();

  public void addItems(T item) {
    items.add(item);
  }

  public void showItems() {
    System.out.println(items);
  }

  @Override
  public String toString() {
    return "Store [items=" + items + "]";
  }

}