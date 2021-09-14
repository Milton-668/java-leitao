package fundamentos;

public class ExemplosInferencia {

    public static void main(String[] args) {

        //A inferencia é a forma de declararmos uma variável sem que passemos
        //explicitamente o tipo da mesma da seguinte forma:

        var n1 = 10.50; // -> Nesse caso temos double
        var n2 = 10; // -> inteiro
        final var texto = "Esse é o novo texto"; // -> String
        //também conseguimos deixa-la como constante conforme exemplo acima.
        var soma = n1+n2;

        System.out.println(texto);
        System.out.println(soma);

    }
}
