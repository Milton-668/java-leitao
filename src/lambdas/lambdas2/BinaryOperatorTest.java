package lambdas.lambdas2;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> x + y;
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0, 3.0));

        BinaryOperator<Integer> calc2 = (x, y) -> x + y;
        System.out.println(calc2.apply(10, 5));

        calc2 = (x, y) -> x * y;
        System.out.println(calc2.apply(10, 5));
    }

}
