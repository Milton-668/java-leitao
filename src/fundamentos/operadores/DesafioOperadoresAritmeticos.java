package fundamentos.operadores;

public class DesafioOperadoresAritmeticos {

    public static void main(String[] args) {

        int f1Up = 6 * (3 + 2);
        int f1Down = 3 * 2;
        double pUp = Math.pow(f1Up, 2);
        double r1 = pUp / f1Down;

        System.out.println(r1);

        int f2 = ((1 - 5) * (2 - 7) / 2);
        double r2 = Math.pow(f2, 2);

        System.out.println(r2);

        double up = r1 - r2;
        double rUp = Math.pow(up, 3);

        System.out.println(rUp);

        double ndown = 10;
        double rdown = Math.pow(ndown, 3);

        System.out.println(rdown);

        double produto = rUp / rdown;
        System.out.println("Produto " + produto);

    }
}
