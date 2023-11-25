import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option;
        String dateInitial;
        String dateFinal;
        String dateToSearch;
        Newspaper newspaper = new Newspaper();
        Article article01 = new Article("The Future of Sustainable Urban Design: Innovations and Challenges",
                "11/01/2001");
        Article article02 = new Article("Exploring Mindfulness: Strategies for a Balanced Life",
                "25/06/2011");
        Article article03 = new Article("Unraveling the Mysteries of Quantum Computing: A Layman's Guide",
                "18/10/2017");
        Article article04 = new Article("Navigating the Gig Economy: Thriving in Flexible Work Environments",
                "07/04/2018");
        Article article05 = new Article("The Evolution of AI in Healthcare: Revolutionizing Patient Care",
                "09/05/2023");
        Article article06 = new Article("Rediscovering Ancient Remedies: Traditional Healing in Modern Times",
                "18/10/2023");
        Article article07 = new Article("From Screen to Page: Adapting Literature for the Big Screen",
                "08/09/2025");

        newspaper.addArticle(article01);
        newspaper.addArticle(article02);
        newspaper.addArticle(article03);
        newspaper.addArticle(article04);
        newspaper.addArticle(article05);
        newspaper.addArticle(article06);
        newspaper.addArticle(article07);

        System.out.println("Do you want to search by date or date range? (0/1)");
        option = sc.nextInt();
        if (option == 0) {
            System.out.println("What date do you want to search?");
            dateToSearch = sc.next();
            System.out.println("Show articles from " + dateToSearch + ".");

            System.out.println("==========================================================================");
            List<Article> searchResult = Newspaper.getArticlesPerDate(dateToSearch);
            for (Article article : searchResult) {
                System.out.println(article);

                System.out.println("==========================================================================");
            }
        } else if (option == 1) {
            System.out.println("What is the start date?");
            dateInitial = sc.next();
            System.out.println("What is the end date?");
            dateFinal = sc.next();

            System.out.println("Show articles from " + dateInitial + " to " + dateFinal + ".");

            System.out.println("==========================================================================");
            List<Article> searchResult = Newspaper.getArticlesPerDateRange(dateInitial, dateFinal);
            for (Article article : searchResult) {
                System.out.println(article);
                System.out.println("==========================================================================");
            }

        } else {
            System.out.println("Parameters must be 0 or 1");
        }
        sc.close();

    }
}
