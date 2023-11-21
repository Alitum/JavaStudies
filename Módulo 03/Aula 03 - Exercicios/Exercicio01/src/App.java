public class App {
    public static void main(String[] args) throws Exception {

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        System.out.println("-- Simple Calculator --");
        System.out.println("Addition: " + simpleCalculator.sum(2.5, 2.5));
        System.out.println("Subtraction: " + simpleCalculator.sub(2, 01));
        System.out.println("Multiplication: " + simpleCalculator.mul(3, 2));
        System.out.println("Division: " + simpleCalculator.div(4, 2));

        System.out.println("-- Scientific Calculator --");
        System.out.println("Power: " + scientificCalculator.power(2, 4));
        System.out.println("Sqr Root: " + scientificCalculator.sqrRoot(9));
    }
}
