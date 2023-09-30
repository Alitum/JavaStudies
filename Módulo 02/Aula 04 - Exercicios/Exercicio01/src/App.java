public class App {
    public static void main(String[] args) throws Exception {
        Book book01 = new Book("Dom Casmurro", "Machado de Assis", 1889);
        Book book02 = new Book("O Príncipe", "Maquiavel", 1532);
        Book book03 = new Book("Dom Casmurro", "Machado de Assis", 1889);

        System.out.println("ToString:");
        System.out.println(book01);
        System.out.println(book02);
        System.out.println(book03);

        System.out.println("HashCode:");
        System.out.println(book01.hashCode());
        System.out.println(book02.hashCode());
        System.out.println(book03.hashCode());

        System.out.println("Comparison: book01 with book02:");
        System.out.println(book01.equals(book02));
        System.out.println("Comparison: book01 with book03:");
        System.out.println(book01.equals(book03));

    }
}
