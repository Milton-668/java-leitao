package lambdas.lambdas2;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<Produto> isCaro =
                p1 -> (p1.preco * (1 - p1.desconto)) >= 7500;

        Produto p1 = new Produto("Note", 3700, 0.10);
        System.out.println(isCaro.test(p1));
    }
}
