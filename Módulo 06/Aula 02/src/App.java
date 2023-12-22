import java.util.function.*;

public class App {
    public static void main(String[] args) throws Exception {

        ! Predicate
        Predicate<Integer> ePar = num -> num % 2 == 0;

        System.out.println(ePar.test(4));
        System.out.println(ePar.test(7));

        // ! Function
        // Function<String, Integer> funcaoTamanho = texto -> texto.length();

        // System.out.println(funcaoTamanho.apply("Eucurso"));

        // ! Supplier
        // Supplier<String> fornecedorSaudacao = () -> "Hello World";

        // System.out.println(fornecedorSaudacao.get());

        // ! Consumer
        // Consumer<String> consumidorImpressao = texto -> System.out.println(texto);

        // consumidorImpressao.accept("Expressões Lambda em Java!");

        // ! Binary Operator
        BinaryOperator<Integer> operadorSoma = (numero1, numero2) -> numero1 + numero2;

        System.out.println(operadorSoma.apply(5, 7));
    }
}
