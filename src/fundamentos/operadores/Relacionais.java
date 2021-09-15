package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;


        System.out.println(a == b);
        System.out.println(30 != 40);
        System.out.println(3 > 5);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(0 > 0);

        double nota = 8.5;
        boolean bomComportamento = true;
        boolean mediaPassa = nota >= 7;
        boolean desconto = bomComportamento && mediaPassa;

        System.out.println("Terá desconto? " + desconto);

    }
}
