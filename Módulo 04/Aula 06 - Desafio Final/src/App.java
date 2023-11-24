public class App {
    public static void main(String[] args) throws Exception {

        Book gameOfThrones = new Book("A Game of Thrones", "George Martin", "Fantasy");
        Book gregor = new Book("Gregor the Overlander", "Suzanne Collins", "Fantasy");
        Book gregor2 = new Book("Gregor And The Prophecy Of Bane", "Suzanne Collins", "Fantasy");
        Book gregor3 = new Book("Gregor and the Curse of the Warmbloods", "Suzanne Collins", "Fantasy");
        Book bible = new Book("The Bible", "God", "Religion");
        Book cosmos = new Book("Cosmos", "Carl Sagan", "Science");

        Library library = new Library();

        library.addBook(gameOfThrones);
        library.addBook(gregor);
        library.addBook(gregor2);
        library.addBook(gregor3);
        library.addBook(cosmos);
        library.addBook(bible);

        library.listAllBooks();

        library.listAllCategories();

        library.searchByCategory("Fantasy");
        library.searchByCategory("Religion");
        library.searchByCategory("Science");
    }
}
