package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTest3 {

    public static void main(String... args) {

        //BinaryOperator<> Função que faz operação entre
        //dois numeros e entrega o resultado
        BinaryOperator<Double> calc = (x, y) -> { return x + y; };
        System.out.println(calc.apply(2.0,3.0));

        BinaryOperator<Integer> calc2 = (x, y) -> { return x * y; };
        System.out.println(calc2.apply(2,3));
    }
}
