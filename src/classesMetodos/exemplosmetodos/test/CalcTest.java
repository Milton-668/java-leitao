package classesMetodos.exemplosmetodos.test;

import classesMetodos.exemplosmetodos.domain.Calculadora;

public class CalcTest {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.soma();
        calculadora.subtrai();

        calculadora.multiplica(10, 10);

        double result = calculadora.divide(200, 10);
        System.out.println(result);

        calculadora.imprimeDivisao(1000, 0);
    }
}
