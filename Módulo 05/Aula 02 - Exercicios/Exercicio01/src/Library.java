import java.util.*;

public class Library {
  protected List<Book> collection = new ArrayList<>();
  protected Set<String> categories = new HashSet<>();
  protected Map<Integer, LibraryUser> Users = new HashMap<>();

  public void registerUser(LibraryUser user) {
    Users.put((Users.size() + 1), user);
  }

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
      System.out.println(book.showDetails(book));
    }
    System.out.println();
  }

  public void lendBook(Book book, LibraryUser U) {
    if (book.borrowed) {
      throw new BookUnavailableException("The book " + book.getTitle() + " is unavailable.");
    } else {
      if (U.getAmntBooks() >= 5) {
        throw new LimitBooksExceededException(U.getName() + " Limit of books exceeded.");
      } else {
        book.borrowed = true;
        book.borrowedBy = U;
        U.setAmntBooks(U.getAmntBooks() + 1);
        U.borrowedBooks.add(book);
        System.out.println("Book " + book.getTitle() + " successfully borrowed by " + U.getName() + "!");
      }
    }
  }

  public void returnBook(Book book, LibraryUser U) {
    if (book.borrowed && book.borrowedBy == U) {
      book.borrowed = false;
      book.borrowedBy = null;
      U.setAmntBooks(U.getAmntBooks() - 1);
      U.borrowedBooks.remove(book);
      System.out.println("Book " + book.getTitle() + " successfully returned by " + U.getName());
    } else if (!book.borrowed) {
      System.out.println("Book " + book.getTitle() + " is not borrowed.");
    } else {
      System.out.println("Book " + book.getTitle() + " is not borrowed by " + U.getName());
    }

  }

}
