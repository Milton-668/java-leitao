package lambdas;

public class CalculoTest {

    public static void main(String[] args) {

        Calculo somar = new Somar();
        Calculo multiplicar = new Multiplicar();

        System.out.println(somar.executar(2, 3));
        System.out.println(multiplicar.executar(2, 3));
    }
}
