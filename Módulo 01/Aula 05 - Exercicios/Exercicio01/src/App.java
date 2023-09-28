public class App {
    public static void main(String[] args) {

        int number = 150;

        Integer numberWrapper = number;

        Integer otherObject = number;

        System.out.println("Comparação via operador de igualdade:");
        if (numberWrapper == otherObject) {
            System.out.println("São iguais.");
        } else {
            System.out.println("Não são iguais.");
        }

        System.out.println("Comparação via equals:");
        if (numberWrapper.equals(otherObject)) {
            System.out.println("São iguais.");
        } else {
            System.out.println("Não são iguais.");
        }
    }
}
