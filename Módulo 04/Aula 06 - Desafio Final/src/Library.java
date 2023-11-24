import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Library {
  protected List<Book> collection = new ArrayList<>();
  protected Set<String> categories = new HashSet<>();

  public Library() {
  }

  public void addBook(Book book) {
    collection.add(book);
  }

  public void removeBook(Book book) {
    collection.remove(book);
  }

  public void listAllBooks() {
    System.out.println("List of books:");
    for (Book book : collection) {
      System.out.println(book.showDetails(book.title));
    }
    System.out.println();
  }

  public void listAllCategories() {

    System.out.println("List of categories:");
    for (Book book : collection) {
      categories.add(book.category);
    }
    System.out.println(categories);
    System.out.println();
  }

  public void searchByCategory(String category) {
    System.out.println("List of books in " + category + ":");
    for (Book book : collection) {
      if (book.category.equals(category)) {
        System.out.println(book.title);
      }
    }

    System.out.println();
  }
}
