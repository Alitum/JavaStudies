import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Article {
  private String title;
  private LocalDate publicationDate;

  public Article(String title, String publicationDate) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    this.title = title;
    this.publicationDate = LocalDate.parse(publicationDate, formatter);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDate getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(String publicationDate) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    this.publicationDate = LocalDate.parse(publicationDate, formatter);
  }

  @Override
  public String toString() {
    return "Title: " + title + "\nDate of publication: " + publicationDate;
  }

}
