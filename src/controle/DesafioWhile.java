package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        int contaNota = 0;
        double soma = 0;

        while (nota != -1) {
            System.out.println("Insira a nota do aluno:");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                contaNota++;
                soma += nota;
            } else if (nota == -1) {
                System.out.println("Fim");
            } else System.out.println("Valor inválido");
        }
        double media = soma / contaNota;
        System.out.println("Soma das notas:" + soma);
        System.out.println("Quantidade de notas: " + contaNota);
        System.out.println("Média dos alunos:" + media);
        entrada.close();
    }
}
