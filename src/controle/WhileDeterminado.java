package controle;

public class WhileDeterminado {

    public static void main(String[] args) {
        /*Utilizamos o laço While quando temos uma
        quantidade indeterminada de vezes e trabalharmos
        nesse dado intervalo através de um contador*/

        int i = 2;

        while (i <= 20) {
            System.out.printf("i = %d\n", i);
            i += 2;
        }
    }
}
