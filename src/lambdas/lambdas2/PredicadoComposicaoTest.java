package lambdas.lambdas2;

import java.util.function.Predicate;

public class PredicadoComposicaoTest {

    public static void main(String[] args) {
        //Predicate recebe um parametro e retorna um boolean
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
        //a função test pede o valor para ser validado
        System.out.println(isPar.test(122));
        //Aqui temos um exemplo de composição com o and unindo o isPar
        //com o isTresDigitos para verificar se os dois são true
        System.out.println(isPar.and(isTresDigitos).test(123));
        //Aqui checa se um ou outro é verdadeiro
        System.out.println(isPar.or(isTresDigitos).test(123));
        //Aqui nós temos um método de negate, que ao ser inserido após a função
        //criada e caso ela seja false ele nega e passa a ser true(inversor)
        System.out.println(isPar.negate().or(isTresDigitos).test(123));
        System.out.println(isPar.negate().and(isTresDigitos).negate().test(12));
    }
}
