public class App {
    public static void main(String[] args) throws Exception {
        Printer.print(Printer.example.toString());
        Printer.example.setVariableStatic("Random value changed");
        Printer.print(Printer.example.toString());
    }
}
