package lambdas.lambdas2;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        //Exemplo de encadeamento de funções:

        //Nesse primeiro ponto temos uma função que rebece um valor inteiro e retorna uma string
        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Ímpar";
        System.out.println(parOuImpar.apply(32));
        //Nesse segundo ponto recebemos uma string e retornamos uma string tbm.
        Function<String, String> resultado = valor -> "O resultado é: " + valor;
        //Nesse terceiro recebemos uma string e passamos uma string tbm.
        Function<String, String> empolgado = valor -> "!!!" + valor;
        //Fica bem evidenciado a forma de deixar pequenas responsabilidades para cada função,
        //gerando um bom reúso de código.
        String resultadoFinal = parOuImpar
                .andThen(resultado)
                .andThen(empolgado)
                .apply(32);
        System.out.println(resultadoFinal);
    }
}
