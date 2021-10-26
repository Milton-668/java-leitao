package classesMetodos.exemplosmetodos;

public class CalcPrimitivoTest {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int a = 1;
        int b = 2;

        calculadora.alteraDoisNumeros(a, b);
        System.out.println("---In CalcPrimitivoTest---");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }
}
