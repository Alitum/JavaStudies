
public class Book {
  protected String title;
  protected String author;
  protected String category;
  protected boolean borrowed = false;
  protected LibraryUser borrowedBy;

  public Book(String title, String author, String category) {
    this.title = title;
    this.author = author;
    this.category = category;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String showDetails(Book book) {
    if (borrowed) {
      return "Title: " + title + "| Author: " + author + "| Category: " + category + "| Status : Unavailable";
    } else {
      return "Title: " + title + "| Author: " + author + "| Category: " + category + "| Status : Available";
    }
  }

  @Override
  public String toString() {
    return title;
  }

}
