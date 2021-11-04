package lambdas.lambdas2;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorTest2 {

    public static void main(String[] args) {
        //recebe dois parametros e realiza uma operação
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(10.0, 5.0));
        //Recebe 3 parametros e retorna
        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado.apply(10.0, 5.0));

        Function<Double, String> conceito =
                m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(10.00, 5.00));
    }
}
