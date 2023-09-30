import java.util.Objects;

public class Book {
  private String title;
  private String author;
  private Integer year;

  public Book(String title, String author, Integer year) {
    this.title = title;
    this.author = author;
    this.year = year;
  }

  public String toString() {
    return "Book [Title: " + title + " | Author: " + author + " | Year: " + year + "]";
  }

  public int hashCode() {
    return Objects.hash(this.title, this.author, this.year);
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Book book = (Book) obj;
    return Objects.equals(this.title, book.title) && Objects.equals(this.author, book.author)
        && Objects.equals(this.year, book.year);
  }
}
