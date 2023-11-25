import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Newspaper {
  static final List<Article> articles = new ArrayList<>();

  public void addArticle(Article article) {
    articles.add(article);
  }

  public static List<Article> getArticlesPerDate(String dateString) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate date = LocalDate.parse(dateString, formatter);
    List<Article> articlesPerDate = new ArrayList<>();
    for (Article article : articles) {
      if (article.getPublicationDate().equals(date)) {
        articlesPerDate.add(article);
      }
    }

    if (articlesPerDate.isEmpty()) {
      throw new getArticleException("No articles found");
    } else {
      return articlesPerDate;
    }
  }

  public static List<Article> getArticlesPerDateRange(String dateString, String dateString2) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate dateInitial = LocalDate.parse(dateString, formatter);
    LocalDate dateFinal = LocalDate.parse(dateString2, formatter);
    List<Article> articlesUntilDate = new ArrayList<>();
    for (Article article : articles) {
      if (article.getPublicationDate().isAfter(dateInitial) && article.getPublicationDate().isBefore(dateFinal)) {
        articlesUntilDate.add(article);
      }
    }
    if (articlesUntilDate.isEmpty()) {
      throw new getArticleException("No articles found");
    } else {
      return articlesUntilDate;
    }
  }
}
