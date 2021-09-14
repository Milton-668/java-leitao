package fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        double x = 4.50;
        double y = 3.50;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        System.out.println(x % y);

        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        //força o cast para vir o valor literal
        System.out.println(a / (double) b);

        //Exemplo utilizando a library math em potência

        int c = 3 * 4 - 10;
        int d = (int) Math.pow(c, 3);
        double e = Math.pow(c, 3);

        System.out.println(d);
        System.out.println(e);
    }


}
