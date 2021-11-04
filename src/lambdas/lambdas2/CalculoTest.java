package lambdas.lambdas2;

public class CalculoTest {

    public static void main(String[] args) {

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2, 3));
        //Aqui nós temos um polimorfismo
        calculo = new Mutiplicar();
        System.out.println(calculo.executar(2, 3));


    }
}
