package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Quantos alunos?");
        int contaAlunos = entry.nextInt();

        System.out.println("Quantas notas por aluno?");
        int contaNotas = entry.nextInt();

        double[][] notasTurma = new double[contaAlunos][contaNotas];
        double total = 0;
        for (int a = 0; a < notasTurma.length; a++) {
            for (int n = 0; n < notasTurma[a].length; n++) {
                System.out.printf("Informe a %d° nota do %d° aluno: ", a + 1, n + 1);
                notasTurma[a][n] = entry.nextDouble();
                total += notasTurma[a][n];
            }
        }
        double media = total / (contaAlunos * contaNotas);
        System.out.println("Média da turma é" + media);

        for (double [] notasAluno: notasTurma){
            System.out.println(Arrays.toString(notasAluno));
        }
        entry.close();
    }
}
