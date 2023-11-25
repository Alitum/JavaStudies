import java.util.*;

public class LibraryUser {
  protected String name;
  protected int amntBooks;
  protected Set<Book> borrowedBooks = new HashSet<>();

  public LibraryUser(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmntBooks() {
    return amntBooks;
  }

  public void setAmntBooks(int amntBooks) {
    this.amntBooks = amntBooks;
  }

  public void showDetails() {
    if (amntBooks > 0) {
      System.out.println(
          "Name: " + name + "| Amount of books: " + amntBooks + "\n BorrowedBooks: " + borrowedBooks.toString());
    } else {
      System.out.println("Name: " + name + "| Amount of books: 0");
    }
  }

}
