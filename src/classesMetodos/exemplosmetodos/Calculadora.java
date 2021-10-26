package classesMetodos.exemplosmetodos;

public class Calculadora {

    public void soma() {
        System.out.println(10 + 10);
    }

    public void subtrai() {
        System.out.println(20 - 10);
    }

    public void multiplica(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public double divide(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }

    public void imprimeDivisao(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Não existe divisão por zero!");
            //Esse return serve como um break de um laço, só que só funciona em métodos
            //que retornamos void. Nesse caso de método se o segundo valor a ser passada
            //for zero apresentará um infinity, então para parar o método colocamos o return
            return;
        }
        System.out.println(n1 / n2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("---In alteraDoisNumeros---");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);
    }
}
