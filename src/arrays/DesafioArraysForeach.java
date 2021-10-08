package arrays;

import java.util.Scanner;

public class DesafioArraysForeach {

    public static void main(String[] args) {

        int contaNota = 0;
        double soma = 0;

        Scanner entry = new Scanner(System.in);

        System.out.println("Quantas notas deseja inserir?");
        contaNota = entry.nextInt();

        double[] notas = new double[contaNota];
        for (int i = 0; i < contaNota; i++) {
            System.out.printf("Insira a %d nota:", i + 1);
            notas[i] = entry.nextDouble();
        }
        for (double somaNota : notas) {
            soma += somaNota;
        }
        double media = (soma / notas.length);
        System.out.println("A média das notas é: " + media);
        entry.close();
    }
}
