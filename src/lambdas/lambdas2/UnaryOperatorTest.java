package lambdas.lambdas2;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

    public static void main(String[] args) {

        //Mesmo parametro de entrada é o mesmo de saida
        //Muito utilizado no encadeamento
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;
        //andThen vai unindo as funções.
        int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        System.out.println(resultado1);
        //o compose nesse caso começa do final para o começo (aoQuadrado-vezesDois-maisDois)
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
        System.out.println(resultado2);
    }
}
