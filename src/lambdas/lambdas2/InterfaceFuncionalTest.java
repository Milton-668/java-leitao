package lambdas.lambdas2;

public class InterfaceFuncionalTest {

    public static void main(String[] args) {

        //No caso de nossa função lambda nós temos dois parâmetros que vem
        //da interface cálculo de modo abstract onde que posso trabalhar com
        //ela da forma que eu precisar, mas seguindo a estrutura de passar, os
        //dois valores na function.
        Calculo soma = (x, y) -> {
            return x + y;
        };
        System.out.println(soma.executar(2, 3));

        //Apenas uma sentença de código permite a não utilização
        //do par de chaves.
        Calculo modulo = (k, y) -> k % y;
        System.out.println(modulo.executar(10, 4));

        Calculo mult = (l, m) -> {
            double a = l * m;
            return a;
        };
        System.out.println(mult.executar(10, 4));

        System.out.println(mult.bacana());
        System.out.println(Calculo.legal());
    }
}
