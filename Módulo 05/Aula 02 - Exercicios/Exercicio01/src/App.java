public class App {
    public static void main(String[] args) throws Exception {
        Book gameOfThrones = new Book("A Game of Thrones", "George Martin", "Fantasy");
        Book gregor = new Book("Gregor the Overlander", "Suzanne Collins", "Fantasy");
        Book gregor2 = new Book("Gregor And The Prophecy Of Bane", "Suzanne Collins", "Fantasy");
        Book gregor3 = new Book("Gregor and the Curse of the Warmbloods", "Suzanne Collins", "Fantasy");
        Book bible = new Book("The Bible", "God", "Religion");
        Book cosmos = new Book("Cosmos", "Carl Sagan", "Science");
        Book contact = new Book("Contact", "Carl Sagan", "Science");

        Library library = new Library();

        library.addBook(gameOfThrones);
        library.addBook(gregor);
        library.addBook(gregor2);
        library.addBook(gregor3);
        library.addBook(cosmos);
        library.addBook(bible);
        library.addBook(contact);

        LibraryUser user01 = new LibraryUser("Fulano");
        LibraryUser user02 = new LibraryUser("Ciclano");

        try {
            library.lendBook(cosmos, user01);
        } catch (LimitBooksExceededException e) {
            System.out.println(e.getMessage());
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.lendBook(cosmos, user02);
        } catch (LimitBooksExceededException e) {
            System.out.println(e.getMessage());
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.lendBook(gameOfThrones, user01);
        } catch (LimitBooksExceededException e) {
            System.out.println(e.getMessage());
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.lendBook(gregor, user01);
        } catch (LimitBooksExceededException e) {
            System.out.println(e.getMessage());
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.lendBook(gregor2, user01);
        } catch (LimitBooksExceededException e) {
            System.out.println(e.getMessage());
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.lendBook(gregor3, user01);
        } catch (LimitBooksExceededException e) {
            System.out.println(e.getMessage());
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.lendBook(bible, user01);
        } catch (LimitBooksExceededException e) {
            System.out.println(e.getMessage());
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.lendBook(bible, user02);
        } catch (LimitBooksExceededException e) {
            System.out.println(e.getMessage());
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.lendBook(gregor, user02);
        } catch (LimitBooksExceededException e) {
            System.out.println(e.getMessage());
        } catch (BookUnavailableException e) {
            System.out.println(e.getMessage());
        }

    }
}
